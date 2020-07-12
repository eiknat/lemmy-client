package com.eiknat.lemmyclient.api.post

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CreatePost")
class CreatePost(val data: Data): Op() {

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
