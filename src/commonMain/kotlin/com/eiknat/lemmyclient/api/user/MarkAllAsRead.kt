package com.eiknat.lemmyclient.api.user

import kotlinx.serialization.Serializable

@Serializable
class MarkAllAsRead(val data: Data) {
    val op: String = "MarkAllAsRead"

    @Serializable
    data class Data(
        val auth: String
    )
}
