package com.eiknat.lemmyclient.api.comment.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SaveCommentForm(
    @SerialName("comment_id")
    val commentId: Int,
    val save: Boolean,
    override val auth: String,
): RequireAuthentication
