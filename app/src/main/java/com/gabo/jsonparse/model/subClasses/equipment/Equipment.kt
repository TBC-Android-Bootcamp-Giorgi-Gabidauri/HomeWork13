package com.gabo.jsonparse.model.subClasses.equipment

import com.gabo.jsonparse.model.subClasses.equipment.subClasses.*
import com.squareup.moshi.Json

data class Equipment(
    val id: String,
    val title: String,
    val invNumber: String,
    val categoryId: String,
    val modelId: String,
    val brandId: String,
    val year: Int,
    val specifications: List<Specification>,
    val weight: Int,
    @Json(name = "additional_specifications")
    val additionalSpecifications: Any?,
    val structureId: String,
    val organizationId: String,
    val beaconType: String?,
    val beaconId: String,
    val beaconVendor: String,
    @Json(name = "RFID")
    val rFID: Long,
    val dailyPrice: String?,
    val inactive: Boolean?,
    val tag: Tag,
    val telematicBox: Any?,
    val createdAt: String,
    @Json(name = "special_number")
    val SpecialNumber: String?,
    @Json(name = "last_check")
    val lastCheck: String,
    @Json(name = "next_check")
    val nextCheck: String,
    @Json(name = "responsible_person")
    val responsiblePerson: String?,
    @Json(name = "test_type")
    val testType: String?,
    @Json(name = "unique_equipment_id")
    val uniqueEquipmentId: String,
    @Json(name = "bgl_number")
    val bglNumber: String,
    @Json(name = "serial_number")
    val serialNumber: String?,
    val inventory: Any?,
    val warehouuseId: String,
    val trackingTag: String?,
    val workingHours: String,
    @Json(name = "navaris_criteria")
    val navarisCriteria: Any?,
    @Json(name = "dont_send_to_as400")
    val dontSendToAs400: Boolean,
    val model: Model,
    val category: Category,
    val structure: Structure,
    val wareHouse: Any?,
    val equipmentMedia: List<EquipmentMedia>,
    val telematics: List<Telematic>,
    val isMoving: Boolean
)
