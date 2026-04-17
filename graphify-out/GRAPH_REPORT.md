# Graph Report - .  (2026-04-17)

## Corpus Check
- 95 files · ~149,922 words
- Verdict: corpus is large enough that graph structure adds value.

## Summary
- 1520 nodes · 2203 edges · 87 communities detected
- Extraction: 85% EXTRACTED · 15% INFERRED · 0% AMBIGUOUS · INFERRED: 330 edges (avg confidence: 0.8)
- Token cost: 0 input · 0 output

## Community Hubs (Navigation)
- [[_COMMUNITY_Community 0|Community 0]]
- [[_COMMUNITY_Community 1|Community 1]]
- [[_COMMUNITY_Community 2|Community 2]]
- [[_COMMUNITY_Community 3|Community 3]]
- [[_COMMUNITY_Community 4|Community 4]]
- [[_COMMUNITY_Community 5|Community 5]]
- [[_COMMUNITY_Community 6|Community 6]]
- [[_COMMUNITY_Community 7|Community 7]]
- [[_COMMUNITY_Community 8|Community 8]]
- [[_COMMUNITY_Community 9|Community 9]]
- [[_COMMUNITY_Community 10|Community 10]]
- [[_COMMUNITY_Community 11|Community 11]]
- [[_COMMUNITY_Community 12|Community 12]]
- [[_COMMUNITY_Community 13|Community 13]]
- [[_COMMUNITY_Community 14|Community 14]]
- [[_COMMUNITY_Community 15|Community 15]]
- [[_COMMUNITY_Community 16|Community 16]]
- [[_COMMUNITY_Community 17|Community 17]]
- [[_COMMUNITY_Community 18|Community 18]]
- [[_COMMUNITY_Community 19|Community 19]]
- [[_COMMUNITY_Community 20|Community 20]]
- [[_COMMUNITY_Community 21|Community 21]]
- [[_COMMUNITY_Community 22|Community 22]]
- [[_COMMUNITY_Community 23|Community 23]]
- [[_COMMUNITY_Community 24|Community 24]]
- [[_COMMUNITY_Community 25|Community 25]]
- [[_COMMUNITY_Community 26|Community 26]]
- [[_COMMUNITY_Community 27|Community 27]]
- [[_COMMUNITY_Community 28|Community 28]]
- [[_COMMUNITY_Community 29|Community 29]]
- [[_COMMUNITY_Community 30|Community 30]]
- [[_COMMUNITY_Community 31|Community 31]]
- [[_COMMUNITY_Community 32|Community 32]]
- [[_COMMUNITY_Community 33|Community 33]]
- [[_COMMUNITY_Community 34|Community 34]]
- [[_COMMUNITY_Community 35|Community 35]]
- [[_COMMUNITY_Community 36|Community 36]]
- [[_COMMUNITY_Community 37|Community 37]]
- [[_COMMUNITY_Community 38|Community 38]]
- [[_COMMUNITY_Community 39|Community 39]]
- [[_COMMUNITY_Community 40|Community 40]]
- [[_COMMUNITY_Community 41|Community 41]]
- [[_COMMUNITY_Community 42|Community 42]]
- [[_COMMUNITY_Community 43|Community 43]]
- [[_COMMUNITY_Community 44|Community 44]]
- [[_COMMUNITY_Community 45|Community 45]]
- [[_COMMUNITY_Community 46|Community 46]]
- [[_COMMUNITY_Community 47|Community 47]]
- [[_COMMUNITY_Community 48|Community 48]]
- [[_COMMUNITY_Community 49|Community 49]]
- [[_COMMUNITY_Community 50|Community 50]]
- [[_COMMUNITY_Community 51|Community 51]]
- [[_COMMUNITY_Community 52|Community 52]]
- [[_COMMUNITY_Community 53|Community 53]]
- [[_COMMUNITY_Community 54|Community 54]]
- [[_COMMUNITY_Community 55|Community 55]]
- [[_COMMUNITY_Community 56|Community 56]]
- [[_COMMUNITY_Community 57|Community 57]]
- [[_COMMUNITY_Community 58|Community 58]]
- [[_COMMUNITY_Community 59|Community 59]]
- [[_COMMUNITY_Community 60|Community 60]]
- [[_COMMUNITY_Community 61|Community 61]]
- [[_COMMUNITY_Community 62|Community 62]]
- [[_COMMUNITY_Community 63|Community 63]]
- [[_COMMUNITY_Community 64|Community 64]]
- [[_COMMUNITY_Community 65|Community 65]]
- [[_COMMUNITY_Community 66|Community 66]]
- [[_COMMUNITY_Community 67|Community 67]]
- [[_COMMUNITY_Community 68|Community 68]]
- [[_COMMUNITY_Community 69|Community 69]]
- [[_COMMUNITY_Community 70|Community 70]]
- [[_COMMUNITY_Community 71|Community 71]]
- [[_COMMUNITY_Community 72|Community 72]]
- [[_COMMUNITY_Community 73|Community 73]]
- [[_COMMUNITY_Community 74|Community 74]]
- [[_COMMUNITY_Community 75|Community 75]]
- [[_COMMUNITY_Community 76|Community 76]]
- [[_COMMUNITY_Community 77|Community 77]]
- [[_COMMUNITY_Community 78|Community 78]]
- [[_COMMUNITY_Community 79|Community 79]]
- [[_COMMUNITY_Community 80|Community 80]]
- [[_COMMUNITY_Community 81|Community 81]]
- [[_COMMUNITY_Community 82|Community 82]]
- [[_COMMUNITY_Community 83|Community 83]]
- [[_COMMUNITY_Community 84|Community 84]]
- [[_COMMUNITY_Community 85|Community 85]]
- [[_COMMUNITY_Community 86|Community 86]]

## God Nodes (most connected - your core abstractions)
1. `RaceSessionController` - 92 edges
2. `decode_telemetry_envelope()` - 69 edges
3. `MainActivity` - 39 edges
4. `RaceSessionControllerTest` - 38 edges
5. `SensorNativeController` - 36 edges
6. `MainActivityMonitoringLogicTest` - 35 edges
7. `push_event()` - 31 edges
8. `TcpConnectionsManager` - 25 edges
9. `encode_telemetry_from_json()` - 22 edges
10. `SprintSyncAppLayoutLogicTest` - 21 edges

## Surprising Connections (you probably didn't know these)
- `parse_frame_header()` --calls--> `process_socket_buffer()`  [INFERRED]
  crates\sprint-sync-protocol\src\frame.rs → desktop-tauri\src-tauri\src\tcp_server.rs
- `decode_telemetry_envelope()` --calls--> `root_as_telemetry_envelope()`  [INFERRED]
  crates\sprint-sync-protocol\src\telemetry.rs → crates\sprint-sync-protocol\src\generated\SprintSyncTelemetry_generated.rs
- `decode_telemetry_envelope()` --calls--> `TriggerType`  [INFERRED]
  crates\sprint-sync-protocol\src\telemetry.rs → desktop-tauri\src-tauri\src\state.rs
- `Error` --calls--> `run()`  [INFERRED]
  android\app\src\main\kotlin\com\paul\sprintsync\feature\motion\data\native\SensorNativeEvents.kt → scripts\release-android.mjs
- `decode_request()` --calls--> `handle_clock_sync_request()`  [INFERRED]
  crates\sprint-sync-protocol\src\clock_sync.rs → desktop-tauri\src-tauri\src\clock_sync.rs

## Communities

### Community 0 - "Community 0"
Cohesion: 0.04
Nodes (114): event_details(), handle_clock_sync_request(), normalize_clock_resync_sample_count(), now_host_elapsed_nanos(), start_clock_resync_loop_for_endpoint(), stop_all_clock_resync_loops(), stop_clock_resync_loop_for_endpoint(), try_complete_clock_resync_loop() (+106 more)

### Community 1 - "Community 1"
Cohesion: 0.04
Nodes (25): decode_telemetry_envelope(), ClockResyncRequest, DeviceConfigUpdate, DeviceIdentity, DeviceTelemetry, DeviceTelemetry<'a>, LapResult, LapResult<'a> (+17 more)

### Community 2 - "Community 2"
Cohesion: 0.03
Nodes (14): ClockResyncRequest<'a>, ClockResyncRequestBuilder<'a, 'b, A>, DeviceConfigUpdate<'a>, DeviceConfigUpdateBuilder<'a, 'b, A>, DeviceIdentity<'a>, DeviceIdentityBuilder<'a, 'b, A>, DeviceTelemetryBuilder<'a, 'b, A>, LapResultBuilder<'a, 'b, A> (+6 more)

### Community 3 - "Community 3"
Cohesion: 0.02
Nodes (1): RaceSessionController

### Community 4 - "Community 4"
Cohesion: 0.03
Nodes (48): main(), build_shared_state(), init_tracing(), main(), AppConfig, AppState, CameraFacing, ClientState (+40 more)

### Community 5 - "Community 5"
Cohesion: 0.03
Nodes (44): ClockResyncRequestArgs, ClockResyncRequestBuilder, ClockResyncRequestOffset, DeviceConfigUpdateArgs, DeviceConfigUpdateBuilder, DeviceConfigUpdateOffset, DeviceIdentityArgs, DeviceIdentityBuilder (+36 more)

### Community 6 - "Community 6"
Cohesion: 0.03
Nodes (5): LocalCaptureAction, MainActivity, MonitoringWifiLockMode, PermissionScope, RunDetailsCheckpointTiming

### Community 7 - "Community 7"
Cohesion: 0.03
Nodes (6): ConnectedDeviceMonitoringCardUiState, DisplayLapRow, DisplayLayoutSpec, RunDetailsCheckpointResult, SprintSyncDebugTelemetryState, SprintSyncUiState

### Community 8 - "Community 8"
Cohesion: 0.08
Nodes (53): ClockSyncRequest, ClockSyncResponse, decode_request(), decode_response(), encode_request(), encode_response(), DecodedTelemetryMessage, encode_clock_resync_request() (+45 more)

### Community 9 - "Community 9"
Cohesion: 0.05
Nodes (41): buildAndroidJni(), ensureCargoWithNdk(), ensureRustTargets(), fail(), run(), generateDemoRuns(), canRun(), fail() (+33 more)

### Community 10 - "Community 10"
Cohesion: 0.04
Nodes (19): SessionAnchorState, SessionCameraFacing, SessionClockLockReason, SessionClockResyncRequestMessage, SessionDevice, SessionDeviceConfigUpdateMessage, SessionDeviceIdentityMessage, SessionDeviceRole (+11 more)

### Community 11 - "Community 11"
Cohesion: 0.07
Nodes (42): applySprint20MetersPreset(), assignRole(), bootstrap(), clearScheduledApply(), fetchSavedResultsList(), fetchState(), loadSavedResult(), postControl() (+34 more)

### Community 12 - "Community 12"
Cohesion: 0.05
Nodes (1): SensorNativeController

### Community 13 - "Community 13"
Cohesion: 0.05
Nodes (1): RaceSessionControllerTest

### Community 14 - "Community 14"
Cohesion: 0.06
Nodes (1): MainActivityMonitoringLogicTest

### Community 15 - "Community 15"
Cohesion: 0.1
Nodes (31): finish_telemetry_envelope_buffer(), TelemetryEnvelopeBuilder<'a, 'b, A>, CameraFacing, DecodedTelemetryMessage, DeviceIdentityMessage, DeviceTelemetryMessage, encode_clock_resync_request(), encode_device_config_update() (+23 more)

### Community 16 - "Community 16"
Cohesion: 0.09
Nodes (3): SessionSnapshotBuilder<'a, 'b, A>, SessionTimelineSnapshot<'a>, SessionTimelineSnapshotBuilder<'a, 'b, A>

### Community 17 - "Community 17"
Cohesion: 0.08
Nodes (1): TcpConnectionsManager

### Community 18 - "Community 18"
Cohesion: 0.08
Nodes (10): ClockResync, ConfigUpdate, DecodedTelemetryEnvelope, DeviceTelemetryEnvelope, Identity, LapResultEnvelope, Snapshot, TelemetryEnvelopeFlatBufferCodec (+2 more)

### Community 19 - "Community 19"
Cohesion: 0.09
Nodes (1): SprintSyncAppLayoutLogicTest

### Community 20 - "Community 20"
Cohesion: 0.1
Nodes (4): CameraBinding, CameraFacingSelection, SensorNativeCameraPolicy, SensorNativeCameraSession

### Community 21 - "Community 21"
Cohesion: 0.1
Nodes (1): SensorNativeMathTest

### Community 22 - "Community 22"
Cohesion: 0.12
Nodes (5): NativeDetectionMath, NativeFpsObservation, RoiFrameDiffer, SensorNativeFpsMonitor, SensorOffsetSmoother

### Community 23 - "Community 23"
Cohesion: 0.12
Nodes (1): RaceSessionModelsTest

### Community 24 - "Community 24"
Cohesion: 0.13
Nodes (1): NativeProtocol

### Community 25 - "Community 25"
Cohesion: 0.14
Nodes (1): SessionConnectionsManager

### Community 26 - "Community 26"
Cohesion: 0.14
Nodes (2): MotionDetectionController, MotionDetectionUiState

### Community 27 - "Community 27"
Cohesion: 0.15
Nodes (3): LastRunResult, SavedRunCheckpointResult, SavedRunResult

### Community 28 - "Community 28"
Cohesion: 0.15
Nodes (7): AcceptedClockSyncSample, AdaptiveClockSyncDecision, ClockSyncBurstReason, RaceSessionClockState, RaceSessionUiState, SessionRaceTimeline, SessionRemoteDeviceTelemetryState

### Community 29 - "Community 29"
Cohesion: 0.31
Nodes (12): compare_results(), list_results(), load_result(), app_results_dir(), compare_results(), is_safe_saved_results_file_name(), list_saved_result_items(), load_saved_results_file() (+4 more)

### Community 30 - "Community 30"
Cohesion: 0.17
Nodes (1): TelemetryEnvelopeFlatBufferCodecTest

### Community 31 - "Community 31"
Cohesion: 0.18
Nodes (1): LocalRepository

### Community 32 - "Community 32"
Cohesion: 0.18
Nodes (5): NativeCameraFacing, NativeCameraFpsMode, NativeFrameStats, NativeMonitoringConfig, NativeTriggerEvent

### Community 33 - "Community 33"
Cohesion: 0.2
Nodes (9): ClockSyncSampleReceived, ConnectionResult, EndpointDisconnected, EndpointFound, EndpointLost, Error, PayloadReceived, SessionConnectionEvent (+1 more)

### Community 34 - "Community 34"
Cohesion: 0.25
Nodes (3): SessionClockSyncBinaryCodec, SessionClockSyncBinaryRequest, SessionClockSyncBinaryResponse

### Community 35 - "Community 35"
Cohesion: 0.29
Nodes (1): TcpConnectionsManagerTest

### Community 36 - "Community 36"
Cohesion: 0.33
Nodes (1): ClockDomain

### Community 37 - "Community 37"
Cohesion: 0.33
Nodes (2): MotionCameraFacing, MotionDetectionConfig

### Community 38 - "Community 38"
Cohesion: 0.4
Nodes (2): AppUpdateChecker, UpdateInfo

### Community 39 - "Community 39"
Cohesion: 0.4
Nodes (1): SavedRunResultTest

### Community 40 - "Community 40"
Cohesion: 0.5
Nodes (1): MotionDetectionModelsInstrumentedTest

### Community 41 - "Community 41"
Cohesion: 0.5
Nodes (1): SensorNativePreviewPlatformView

### Community 42 - "Community 42"
Cohesion: 0.5
Nodes (1): SensorNativePreviewViewFactory

### Community 43 - "Community 43"
Cohesion: 0.5
Nodes (1): SensorNativeModelsTest

### Community 44 - "Community 44"
Cohesion: 0.5
Nodes (1): SensorNativeControllerPreviewTimingTest

### Community 45 - "Community 45"
Cohesion: 0.67
Nodes (2): SessionConnectionRole, SessionConnectionStrategy

### Community 46 - "Community 46"
Cohesion: 0.67
Nodes (0): 

### Community 47 - "Community 47"
Cohesion: 0.67
Nodes (1): CardHighlightIntent

### Community 48 - "Community 48"
Cohesion: 0.67
Nodes (1): LocalRepositorySavedRunResultsTest

### Community 49 - "Community 49"
Cohesion: 0.67
Nodes (0): 

### Community 50 - "Community 50"
Cohesion: 1.0
Nodes (0): 

### Community 51 - "Community 51"
Cohesion: 1.0
Nodes (0): 

### Community 52 - "Community 52"
Cohesion: 1.0
Nodes (0): 

### Community 53 - "Community 53"
Cohesion: 1.0
Nodes (1): SessionTriggerRequestArgs<'a>

### Community 54 - "Community 54"
Cohesion: 1.0
Nodes (1): SessionTriggerArgs<'a>

### Community 55 - "Community 55"
Cohesion: 1.0
Nodes (1): SessionTimelineSnapshotArgs<'a>

### Community 56 - "Community 56"
Cohesion: 1.0
Nodes (1): SessionSnapshotDeviceArgs<'a>

### Community 57 - "Community 57"
Cohesion: 1.0
Nodes (1): SessionSnapshotArgs<'a>

### Community 58 - "Community 58"
Cohesion: 1.0
Nodes (1): TriggerRefinementArgs<'a>

### Community 59 - "Community 59"
Cohesion: 1.0
Nodes (1): DeviceConfigUpdateArgs<'a>

### Community 60 - "Community 60"
Cohesion: 1.0
Nodes (1): DeviceIdentityArgs<'a>

### Community 61 - "Community 61"
Cohesion: 1.0
Nodes (1): DeviceTelemetryArgs<'a>

### Community 62 - "Community 62"
Cohesion: 1.0
Nodes (1): LapResultArgs<'a>

### Community 63 - "Community 63"
Cohesion: 1.0
Nodes (0): 

### Community 64 - "Community 64"
Cohesion: 1.0
Nodes (0): 

### Community 65 - "Community 65"
Cohesion: 1.0
Nodes (0): 

### Community 66 - "Community 66"
Cohesion: 1.0
Nodes (0): 

### Community 67 - "Community 67"
Cohesion: 1.0
Nodes (0): 

### Community 68 - "Community 68"
Cohesion: 1.0
Nodes (0): 

### Community 69 - "Community 69"
Cohesion: 1.0
Nodes (0): 

### Community 70 - "Community 70"
Cohesion: 1.0
Nodes (0): 

### Community 71 - "Community 71"
Cohesion: 1.0
Nodes (0): 

### Community 72 - "Community 72"
Cohesion: 1.0
Nodes (0): 

### Community 73 - "Community 73"
Cohesion: 1.0
Nodes (0): 

### Community 74 - "Community 74"
Cohesion: 1.0
Nodes (0): 

### Community 75 - "Community 75"
Cohesion: 1.0
Nodes (0): 

### Community 76 - "Community 76"
Cohesion: 1.0
Nodes (0): 

### Community 77 - "Community 77"
Cohesion: 1.0
Nodes (0): 

### Community 78 - "Community 78"
Cohesion: 1.0
Nodes (0): 

### Community 79 - "Community 79"
Cohesion: 1.0
Nodes (0): 

### Community 80 - "Community 80"
Cohesion: 1.0
Nodes (0): 

### Community 81 - "Community 81"
Cohesion: 1.0
Nodes (0): 

### Community 82 - "Community 82"
Cohesion: 1.0
Nodes (0): 

### Community 83 - "Community 83"
Cohesion: 1.0
Nodes (0): 

### Community 84 - "Community 84"
Cohesion: 1.0
Nodes (0): 

### Community 85 - "Community 85"
Cohesion: 1.0
Nodes (0): 

### Community 86 - "Community 86"
Cohesion: 1.0
Nodes (0): 

## Knowledge Gaps
- **161 isolated node(s):** `PermissionScope`, `LocalCaptureAction`, `MonitoringWifiLockMode`, `RunDetailsCheckpointTiming`, `SprintSyncUiState` (+156 more)
  These have ≤1 connection - possible missing edges or undocumented components.
- **Thin community `Community 50`** (2 nodes): `Theme.kt`, `SprintSyncTheme()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 51`** (2 nodes): `Headers.kt`, `SectionHeader()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 52`** (2 nodes): `MetricDisplay.kt`, `MetricDisplay()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 53`** (2 nodes): `SessionTriggerRequestArgs<'a>`, `.default()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 54`** (2 nodes): `SessionTriggerArgs<'a>`, `.default()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 55`** (2 nodes): `SessionTimelineSnapshotArgs<'a>`, `.default()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 56`** (2 nodes): `SessionSnapshotDeviceArgs<'a>`, `.default()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 57`** (2 nodes): `SessionSnapshotArgs<'a>`, `.default()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 58`** (2 nodes): `TriggerRefinementArgs<'a>`, `.default()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 59`** (2 nodes): `DeviceConfigUpdateArgs<'a>`, `.default()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 60`** (2 nodes): `DeviceIdentityArgs<'a>`, `.default()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 61`** (2 nodes): `DeviceTelemetryArgs<'a>`, `.default()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 62`** (2 nodes): `LapResultArgs<'a>`, `.default()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 63`** (2 nodes): `raceClock.js`, `deriveMonitoringElapsedMs()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 64`** (2 nodes): `ActionButton()`, `ActionButton.tsx`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 65`** (2 nodes): `SystemDetails.tsx`, `SystemDetails()`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 66`** (1 nodes): `build.gradle.kts`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 67`** (1 nodes): `settings.gradle.kts`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 68`** (1 nodes): `build.gradle.kts`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 69`** (1 nodes): `settings.gradle.kts`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 70`** (1 nodes): `build.gradle.kts`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 71`** (1 nodes): `Color.kt`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 72`** (1 nodes): `Shape.kt`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 73`** (1 nodes): `Type.kt`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 74`** (1 nodes): `lib.rs`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 75`** (1 nodes): `mod.rs`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 76`** (1 nodes): `vite.config.ts`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 77`** (1 nodes): `vite-env.d.ts`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 78`** (1 nodes): `types.ts`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 79`** (1 nodes): `Card.tsx`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 80`** (1 nodes): `DeviceCard.tsx`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 81`** (1 nodes): `MonitoringControls.tsx`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 82`** (1 nodes): `RaceTimerPanel.tsx`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 83`** (1 nodes): `SavedResultsPanel.tsx`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 84`** (1 nodes): `NoLegacyWindowsPaths.inspection.kts`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 85`** (1 nodes): `clean_ui.py`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.
- **Thin community `Community 86`** (1 nodes): `refactor_ui.py`
  Too small to be a meaningful cluster - may be noise or needs more connections extracted.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `decode_telemetry_envelope()` connect `Community 1` to `Community 0`, `Community 2`, `Community 4`, `Community 5`, `Community 9`, `Community 15`?**
  _High betweenness centrality (0.101) - this node is a cross-community bridge._
- **Why does `decode_telemetry_envelope()` connect `Community 1` to `Community 8`, `Community 0`?**
  _High betweenness centrality (0.015) - this node is a cross-community bridge._
- **Are the 63 inferred relationships involving `decode_telemetry_envelope()` (e.g. with `root_as_telemetry_envelope()` and `.payload_type()`) actually correct?**
  _`decode_telemetry_envelope()` has 63 INFERRED edges - model-reasoned connections that need verification._
- **What connects `PermissionScope`, `LocalCaptureAction`, `MonitoringWifiLockMode` to the rest of the system?**
  _161 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `Community 0` be split into smaller, more focused modules?**
  _Cohesion score 0.04 - nodes in this community are weakly interconnected._
- **Should `Community 1` be split into smaller, more focused modules?**
  _Cohesion score 0.04 - nodes in this community are weakly interconnected._
- **Should `Community 2` be split into smaller, more focused modules?**
  _Cohesion score 0.03 - nodes in this community are weakly interconnected._