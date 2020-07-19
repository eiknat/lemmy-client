package com.eiknat.lemmyclient.api.internal.user.message

import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CreatePrivateMessage")
class CreatePrivateMessageRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val content: String,
        val recipient_id: Int,
        val auth: String
    )
}

@Serializable
@SerialName("CreatePrivateMessage")
class CreatePrivateMessageResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val content: String,
        val recipient_id: Int,
        val auth: String
    )
}