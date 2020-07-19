package com.eiknat.lemmyclient.api.post

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CreatePost")
class CreatePostRequest(val data: Data) : RequestOp() {

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

@Serializable
@SerialName("CreatePost")
class CreatePostResponse(val data: Data) : ResponseOp() {

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

