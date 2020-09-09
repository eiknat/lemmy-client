package com.eiknat.lemmyclient.api.comment.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DeleteCommentForm(
    @SerialName("edit_id")
    val commentId: Int,
    val deleted: Boolean,
    override val auth: String,
): RequireAuthentication
