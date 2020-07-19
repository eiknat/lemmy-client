package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("GetUserMentions")
class GetUserMentionsRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val sort: String,
        val page: Int?,
        val limit: Int?,
        val unread_only: Boolean,
        val auth: String
    )
}

@Serializable
@SerialName("GetUserMentions")
class GetUserMentionsResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val mentions: String // UserMentionView
    )
}