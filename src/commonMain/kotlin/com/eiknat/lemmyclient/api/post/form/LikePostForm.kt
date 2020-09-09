package com.eiknat.lemmyclient.api.post.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LikePostForm(
    @SerialName("post_id")
    val postId: Int,
    val score: Int,
    override val auth: String,
): RequireAuthentication
