package com.eiknat.lemmyclient.api.comment.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CommentLikeForm(
    @SerialName("comment_id")
    val commentId: Int,
    val score: Int,
    override val auth: String,
): RequireAuthentication
