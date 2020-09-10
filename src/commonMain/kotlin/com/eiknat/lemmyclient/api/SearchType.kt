package com.eiknat.lemmyclient.api

import kotlinx.serialization.Serializable

@Serializable
enum class SearchType(val type: String) {
    ALL("All"),
    COMMENT("Comments"),
    POST("Posts"),
    COMMUNITY("Communities"),
    USER("Users"),
    URL("Url")
}
