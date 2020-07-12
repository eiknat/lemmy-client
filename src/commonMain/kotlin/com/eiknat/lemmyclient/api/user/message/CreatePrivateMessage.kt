package com.eiknat.lemmyclient.api.user.message

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CreatePrivateMessage")
class CreatePrivateMessage(val data: Data): Op() {

    @Serializable
    data class Data(
        val content: String,
        val recipient_id: Int,
        val auth: String
    )
}
