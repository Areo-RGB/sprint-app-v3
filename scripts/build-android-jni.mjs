import { mkdirSync } from 'node:fs';
import { dirname, resolve } from 'node:path';
import { fileURLToPath } from 'node:url';
import { spawnSync } from 'node:child_process';

const __filename = fileURLToPath(import.meta.url);
const __dirname = dirname(__filename);
const repoRoot = resolve(__dirname, '..');
const jniLibsDir = resolve(repoRoot, 'android', 'app', 'src', 'main', 'jniLibs');

function fail(message, detail = '') {
  console.error(message);
  if (detail.trim().length > 0) {
    console.error(detail.trim());
  }
  process.exit(1);
}

function run(command, args, options = {}) {
  const result = spawnSync(command, args, {
    cwd: repoRoot,
    encoding: 'utf8',
    stdio: ['ignore', 'pipe', 'pipe'],
    ...options,
  });
  if (result.error) {
    throw result.error;
  }
  return result;
}

function ensureCargoWithNdk() {
  const cargoVersion = run('cargo', ['--version']);
  if (cargoVersion.status !== 0) {
    fail('Unable to run cargo. Install Rust and ensure cargo is on PATH.', cargoVersion.stderr || cargoVersion.stdout);
  }

  const ndkHelp = run('cargo', ['ndk', '--help']);
  if (ndkHelp.status !== 0) {
    fail(
      'cargo-ndk is not available. Install it with: cargo install cargo-ndk',
      ndkHelp.stderr || ndkHelp.stdout,
    );
  }
}

function ensureRustTargets() {
  const requiredTargets = [
    'aarch64-linux-android',
    'armv7-linux-androideabi',
    'x86_64-linux-android',
  ];

  const installedTargets = run('rustup', ['target', 'list', '--installed']);
  if (installedTargets.status !== 0) {
    fail(
      'Unable to query installed Rust targets. Ensure rustup is installed and on PATH.',
      installedTargets.stderr || installedTargets.stdout,
    );
  }

  const installed = new Set(
    installedTargets.stdout
      .split(/\r?\n/)
      .map((line) => line.trim())
      .filter(Boolean),
  );

  const missingTargets = requiredTargets.filter((target) => !installed.has(target));
  if (missingTargets.length === 0) {
    return;
  }

  console.log(`Installing missing Rust Android targets: ${missingTargets.join(', ')}`);
  const installTargets = spawnSync('rustup', ['target', 'add', ...missingTargets], {
    cwd: repoRoot,
    stdio: 'inherit',
  });

  if (installTargets.error) {
    throw installTargets.error;
  }
  if (installTargets.status !== 0) {
    fail(
      'Failed to install Rust Android targets.',
      `Try running manually: rustup target add ${missingTargets.join(' ')}`,
    );
  }
}

function buildAndroidJni() {
  mkdirSync(jniLibsDir, { recursive: true });

  const args = [
    'ndk',
    '-t',
    'arm64-v8a',
    '-t',
    'armeabi-v7a',
    '-t',
    'x86_64',
    '-P',
    '24',
    '-o',
    jniLibsDir,
    'build',
    '--release',
    '-p',
    'sprint-sync-protocol-jni',
  ];

  const result = spawnSync('cargo', args, {
    cwd: repoRoot,
    stdio: 'inherit',
  });

  if (result.error) {
    throw result.error;
  }
  if (result.status !== 0) {
    fail('Failed to build Android JNI libraries.');
  }
}

ensureCargoWithNdk();
ensureRustTargets();
buildAndroidJni();
console.log(`Built Android JNI libraries into ${jniLibsDir}`);