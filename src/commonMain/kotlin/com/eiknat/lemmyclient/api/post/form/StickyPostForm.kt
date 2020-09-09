package com.eiknat.lemmyclient.api.post.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StickyPostForm(
    @SerialName("edit_id")
    val postId: Int,
    val stickied: Boolean,
    override val auth: String,
): RequireAuthentication
