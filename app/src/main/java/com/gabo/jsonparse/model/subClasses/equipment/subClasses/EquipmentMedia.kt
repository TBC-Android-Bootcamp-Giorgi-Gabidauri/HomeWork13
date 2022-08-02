package com.gabo.jsonparse.model.subClasses.equipment.subClasses

data class EquipmentMedia(
    val id: String,
    val name: String,
    val files: List<File>,
    val type: String,
    val modelId: String,
    val main: Boolean,
    val modelType: String,
    val createdAt: String,
) {
    data class File(
        val size: String,
        val path: String
    )

}