package com.eiknat.lemmyclient.api.post.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemovePostForm(
    @SerialName("edit_id")
    val postId: Int,
    val removed: Boolean,
    val reason: String?,
    override val auth: String,
): RequireAuthentication
