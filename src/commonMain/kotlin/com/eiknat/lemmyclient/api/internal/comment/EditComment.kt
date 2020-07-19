package com.eiknat.lemmyclient.api.internal.comment

import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("EditComment")
class EditCommentRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val content: String,
        val parent_id: Int?,
        val edit_id: Int,
        val creator_id: Int,
        val post_id: Int,
        val removed: Boolean,
        val deleted: Boolean,
        val reason: String,
        val read: Boolean,
        val auth: String
    )
}

@Serializable
@SerialName("EditComment")
class EditCommentResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val content: String,
        val parent_id: Int?,
        val edit_id: Int,
        val creator_id: Int,
        val post_id: Int,
        val removed: Boolean,
        val deleted: Boolean,
        val reason: String,
        val read: Boolean,
        val auth: String
    )
}
