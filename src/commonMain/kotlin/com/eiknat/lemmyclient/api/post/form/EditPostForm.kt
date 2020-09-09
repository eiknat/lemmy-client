package com.eiknat.lemmyclient.api.post.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EditPostForm(
    @SerialName("edit_id")
    val postId: Int,
    val name: String,
    val url: String?,
    val body: String?,
    @SerialName("community_id")
    val communityId: Int,
    val nsfw: Boolean,
    override val auth: String,
): RequireAuthentication
