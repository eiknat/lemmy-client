package com.eiknat.lemmyclient.api.comment.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoveCommentForm(
    @SerialName("edit_id")
    val commentId: Int,
    val removed: Boolean,
    val reason: String?,
    override val auth: String,
): RequireAuthentication
