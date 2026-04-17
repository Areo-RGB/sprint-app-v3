package com.paul.sprintsync.feature.motion.domain

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MotionDetectionModelsInstrumentedTest {
    @Test
    fun `fromJsonString falls back to legacy roiWidth when roiHeight missing`() {
        val raw = """
            {
              "threshold": 0.01,
              "roiCenterX": 0.55,
              "roiCenterY": 0.45,
              "roiWidth": 0.12,
              "cooldownMs": 1000,
              "processEveryNFrames": 3,
              "cameraFacing": "rear"
            }
        """.trimIndent()

        val parsed = MotionDetectionConfig.fromJsonString(raw)

        assertEquals(0.55, parsed.roiCenterX, 0.0)
        assertEquals(0.45, parsed.roiCenterY, 0.0)
        assertEquals(0.12, parsed.roiHeight, 0.0)
    }

    @Test
    fun `toJsonString and fromJsonString round trip square roi fields`() {
        val original = MotionDetectionConfig(
            threshold = 0.008,
            roiCenterX = 0.62,
            roiCenterY = 0.41,
            roiHeight = 0.19,
            cooldownMs = 800,
            processEveryNFrames = 2,
            cameraFacing = MotionCameraFacing.FRONT,
        )

        val parsed = MotionDetectionConfig.fromJsonString(original.toJsonString())

        assertEquals(original.roiCenterX, parsed.roiCenterX, 0.0)
        assertEquals(original.roiCenterY, parsed.roiCenterY, 0.0)
        assertEquals(original.roiHeight, parsed.roiHeight, 0.0)
        assertEquals(original.threshold, parsed.threshold, 0.0)
        assertEquals(original.cooldownMs, parsed.cooldownMs)
        assertEquals(original.processEveryNFrames, parsed.processEveryNFrames)
        assertEquals(original.cameraFacing, parsed.cameraFacing)
    }
}
