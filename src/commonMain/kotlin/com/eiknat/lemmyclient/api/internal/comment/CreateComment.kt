package com.eiknat.lemmyclient.api.internal.comment

import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import com.eiknat.lemmyclient.models.Comment
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CreateComment")
class CreateCommentRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val content: String,
        val creator_id: Int,
        val parent_id: Int?,
        val edit_id: Int?,
        val post_id: Int,
        val auth: String?
    )
}

@Serializable
@SerialName("CreateComment")
class CreateCommentResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val comment: Comment,
        @SerialName("recipient_ids")
        val recipientIds: Array<Int?>?
    )
}



