package com.eiknat.lemmyclient.api

import kotlinx.serialization.Serializable

@Serializable
enum class SortType(val type: String) {
    ACTIVE("Active"),
    HOT("Hot"),
    NEW("New"),
    TOP_DAY("TopDay"),
    TOP_WEEK("TopWeek"),
    TOP_MONTH("TopMonth"),
    TOP_YEAR("TopYear"),
    TOP_ALL("TopAll"),
}
