package com.eiknat.lemmyclient.api.post.form

import com.eiknat.lemmyclient.api.auth.OptionalAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class GetPostForm(
    val id: Int,
    override val auth: String?,
): OptionalAuthentication


internal fun GetPostForm.toParams() = mapOf(
    Pair("id", id.toString()),
    Pair("auth", auth),
)
