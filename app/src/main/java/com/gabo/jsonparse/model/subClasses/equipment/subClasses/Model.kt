package com.gabo.jsonparse.model.subClasses.equipment.subClasses

data class Model(
    val id: String,
    val name: String,
    val createdAt: String,
    val brand: Brand
) {
    data class Brand(
        val id: String,
        val name: String,
        val cratedAt: String,
    )
}