package com.gabo.jsonparse.model.subClasses.equipment.subClasses

import com.squareup.moshi.Json

data class Category(
    val id: String,
    val name: String,
    @Json(name = " name_de")
    val nameDe: String,
    val createdAt: String,
    val media: List<Any>
)