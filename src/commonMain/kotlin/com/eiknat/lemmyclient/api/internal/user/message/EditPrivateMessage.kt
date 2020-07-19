package com.eiknat.lemmyclient.api.internal.user.message

import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("EditPrivateMessage")
class EditPrivateMessageRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val edit_id: Int,
        val content: String?,
        val deleted: Boolean,
        val read: Boolean,
        val auth: String
    )
}

@Serializable
@SerialName("EditPrivateMessage")
class EditPrivateMessageResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val edit_id: Int,
        val content: String?,
        val deleted: Boolean,
        val read: Boolean,
        val auth: String
    )
}
