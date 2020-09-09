package com.eiknat.lemmyclient.api.comment.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EditCommentForm(
    @SerialName("edit_id")
    val commentId: Int,
    val content: String,
    @SerialName("creator_id")
    val creatorId: Int,
    @SerialName("parent_id")
    val parentId: Int?,
    @SerialName("post_id")
    val postId: Int,
    override val auth: String,
): RequireAuthentication
