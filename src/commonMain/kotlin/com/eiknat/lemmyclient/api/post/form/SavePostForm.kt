package com.eiknat.lemmyclient.api.post.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SavePostForm(
    @SerialName("post_id")
    val postId: Int,
    val save: Boolean,
    override val auth: String,
): RequireAuthentication
