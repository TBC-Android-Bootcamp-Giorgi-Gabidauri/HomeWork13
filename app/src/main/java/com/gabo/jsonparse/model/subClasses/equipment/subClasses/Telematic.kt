package com.gabo.jsonparse.model.subClasses.equipment.subClasses

data class Telematic(
    val timestamp: Long,
    val eventType: String,
    val projectId: String,
    val equipmentId: String,
    val locationName: String,
    val location: TelematicLocation,
    val costCenter: String,
    val lastLatitude: Double,
    val lastLongitude: Double,
    val lastLatLonPrecise: Boolean,
    val lastAddressBtLatLon: String
) {
    data class TelematicLocation(
        val type: String,
        val coordinates: List<List<List<List<Double>>>>
    )
}