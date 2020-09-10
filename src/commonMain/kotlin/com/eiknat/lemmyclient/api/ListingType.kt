package com.eiknat.lemmyclient.api

import kotlinx.serialization.Serializable

@Serializable
enum class ListingType(val type: String) {
    ALL("All"),
    LOCAL("Local"),
    SUBSCRIBED("Subscribed"),
    COMMUNITY("Community")
}
