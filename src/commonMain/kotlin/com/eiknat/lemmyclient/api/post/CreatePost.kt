package com.eiknat.lemmyclient.api.post

import kotlinx.serialization.Serializable

@Serializable
class CreatePost(val data: Data) {
    val op: String = "CreatePost"

    @Serializable
    data class Data(
        val name: String,
        val url: String?,
        val body: String?,
        val nsfw: Boolean,
        val community_id: Int,
        val auth: String
    )
}
