package com.gabo.jsonparse.model.subClasses

data class Filter(
    val name: String,
    val value: Value
) {
    data class Value(
        val max: Long,
        val min: Int
    )
}
