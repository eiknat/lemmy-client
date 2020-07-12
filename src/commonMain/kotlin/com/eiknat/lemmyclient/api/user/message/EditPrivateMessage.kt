package com.eiknat.lemmyclient.api.user.message

import kotlinx.serialization.Serializable

@Serializable
class EditPrivateMessage(val data: Data) {
    val op: String = "EditPrivateMessage"

    @Serializable
    data class Data(
        val edit_id: Int,
        val content: String?,
        val deleted: Boolean,
        val read: Boolean,
        val auth: String
    )
}
