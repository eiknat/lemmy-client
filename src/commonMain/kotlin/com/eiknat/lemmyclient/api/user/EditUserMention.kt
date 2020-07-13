package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("EditUserMention")
class EditUserMentionRequest(val data: Data): RequestOp() {

    @Serializable
    data class Data(
        val user_mention_id: Int,
        val read: Boolean,
        val auth: String
    )
}

@Serializable
@SerialName("EditUserMention")
class EditUserMentionResponse(val data: Data): ResponseOp() {

    @Serializable
    data class Data(
        val user_mention_id: Int,
        val read: Boolean,
        val auth: String
    )
}