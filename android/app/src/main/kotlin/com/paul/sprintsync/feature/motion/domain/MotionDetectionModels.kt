package com.paul.sprintsync.feature.motion.domain

import org.json.JSONException
import org.json.JSONObject

enum class MotionCameraFacing(val wireName: String) {
    REAR("rear"),
    FRONT("front"),
    ;

    companion object {
        fun fromWireName(raw: String?): MotionCameraFacing {
            return when (raw?.trim()) {
                FRONT.wireName -> FRONT
                else -> REAR
            }
        }
    }
}

data class MotionDetectionConfig(
    val threshold: Double,
    val roiCenterX: Double,
    val roiCenterY: Double,
    val roiHeight: Double,
    val cooldownMs: Int,
    val processEveryNFrames: Int,
    val cameraFacing: MotionCameraFacing,
) {
    fun toJsonString(): String {
        return JSONObject()
            .put("threshold", threshold)
            .put("roiCenterX", roiCenterX)
            .put("roiCenterY", roiCenterY)
            .put("roiHeight", roiHeight)
            .put("cooldownMs", cooldownMs)
            .put("processEveryNFrames", processEveryNFrames)
            .put("cameraFacing", cameraFacing.wireName)
            .toString()
    }

    companion object {
        fun defaults(): MotionDetectionConfig {
            return MotionDetectionConfig(
                threshold = 0.006,
                roiCenterX = 0.5,
                roiCenterY = 0.5,
                roiHeight = 0.03,
                cooldownMs = 900,
                processEveryNFrames = 2,
                cameraFacing = MotionCameraFacing.REAR,
            )
        }

        fun fromJsonString(raw: String): MotionDetectionConfig {
            val decoded = try {
                JSONObject(raw)
            } catch (_: JSONException) {
                return defaults()
            }
            return MotionDetectionConfig(
                threshold = decoded.optDouble("threshold", defaults().threshold),
                roiCenterX = decoded.optDouble("roiCenterX", defaults().roiCenterX),
                roiCenterY = decoded.optDouble("roiCenterY", defaults().roiCenterY),
                // Legacy fallback: old saved configs used roiWidth only.
                roiHeight = if (decoded.has("roiHeight")) {
                    decoded.optDouble("roiHeight", defaults().roiHeight)
                } else {
                    decoded.optDouble("roiWidth", defaults().roiHeight)
                },
                cooldownMs = decoded.optInt("cooldownMs", defaults().cooldownMs),
                processEveryNFrames = decoded.optInt("processEveryNFrames", defaults().processEveryNFrames),
                cameraFacing = MotionCameraFacing.fromWireName(decoded.optString("cameraFacing")),
            )
        }
    }
}
