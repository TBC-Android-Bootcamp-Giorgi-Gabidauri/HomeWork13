package com.gabo.jsonparse.model

import com.gabo.jsonparse.model.subClasses.equipment.Equipment
import com.gabo.jsonparse.model.subClasses.internalTransformations.InternalTransformations
import com.gabo.jsonparse.model.subClasses.Filter
import com.gabo.jsonparse.model.subClasses.Location

data class Item(
    val id: String,
    val projectId: String,
    val equipmentId: String,
    val stats: String,
    val requestedBy: String,
    val acceptedBy: String?,
    val author: String,
    val category: String,
    val locations: Location,
    val filters: List<Filter>,
    val type: String,
    val organization: String,
    val address: String,
    val endDate: String,
    val description: String?,
    val prolongDates: List<String>,
    val releaseDates: List<String>,
    val isDummy: Boolean,
    val hasDriver: Boolean,
    val overwriteDate: String?,
    val metaInfo: String?,
    val warehouseId: String?,
    val rentalDescription: String?,
    val internalTransportations: InternalTransformations,
    val startDateMilliseconds: Long,
    val emdDateMilliseconds: Long,
    val equipment: Equipment
)
