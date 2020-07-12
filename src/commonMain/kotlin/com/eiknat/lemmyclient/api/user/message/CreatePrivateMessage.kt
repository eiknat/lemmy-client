package com.eiknat.lemmyclient.api.user.message

import kotlinx.serialization.Serializable

@Serializable
class CreatePrivateMessage(val data: Data) {
    val op: String = "CreatePrivateMessage"

    @Serializable
    data class Data(
        val content: String,
        val recipient_id: Int,
        val auth: String
    )
}
