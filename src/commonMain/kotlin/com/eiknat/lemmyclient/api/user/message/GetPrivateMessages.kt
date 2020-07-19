package com.eiknat.lemmyclient.api.user.message

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("GetPrivateMessages")
class GetPrivateMessagesRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val unread_only: Boolean,
        val page: Int?,
        val limit: Int?,
        val auth: String
    )
}

@Serializable
@SerialName("GetPrivateMessages")
class GetPrivateMessagesResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val unread_only: Boolean,
        val page: Int?,
        val limit: Int?,
        val auth: String
    )
}
