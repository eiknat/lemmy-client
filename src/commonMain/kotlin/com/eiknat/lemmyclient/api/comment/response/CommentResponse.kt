package com.eiknat.lemmyclient.api.comment.response

import com.eiknat.lemmyclient.api.comment.model.Comment
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CommentResponse(
    val comment: Comment,
    @SerialName("recipient_ids")
    val recipientIds: List<Int>,
    @SerialName("form_id")
    val formId: String?
)
