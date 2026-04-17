package com.paul.sprintsync.feature.motion.data.native

import org.junit.Assert.assertEquals
import org.junit.Test

class SensorNativeModelsTest {
    @Test
    fun `fromMap falls back to legacy roiWidth when roiHeight missing`() {
        val parsed = NativeMonitoringConfig.fromMap(
            mapOf(
                "roiCenterX" to 0.6,
                "roiCenterY" to 0.4,
                "roiWidth" to 0.16,
            ),
        )

        assertEquals(0.6, parsed.roiCenterX, 0.0)
        assertEquals(0.4, parsed.roiCenterY, 0.0)
        assertEquals(0.16, parsed.roiHeight, 0.0)
    }

    @Test
    fun `fromMap uses explicit roiHeight when present`() {
        val parsed = NativeMonitoringConfig.fromMap(
            mapOf(
                "roiCenterX" to 0.58,
                "roiCenterY" to 0.52,
                "roiWidth" to 0.10,
                "roiHeight" to 0.22,
            ),
        )

        assertEquals(0.58, parsed.roiCenterX, 0.0)
        assertEquals(0.52, parsed.roiCenterY, 0.0)
        assertEquals(0.22, parsed.roiHeight, 0.0)
    }
}
