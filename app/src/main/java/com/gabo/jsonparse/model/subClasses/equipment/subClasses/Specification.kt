package com.gabo.jsonparse.model.subClasses.equipment.subClasses

data class Specification(
    val key: String,
    val value: Any
) {
    data class ValueHLW(
        val H: Double,
        val L: Int,
        val W: Double
    )
}
