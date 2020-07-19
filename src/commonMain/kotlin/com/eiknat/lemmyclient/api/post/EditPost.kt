package com.eiknat.lemmyclient.api.post

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("EditPost")
class EditPostRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val edit_id: Int,
        val creator_id: Int,
        val community_id: Int,
        val name: String,
        val url: String?,
        val body: String?,
        val removed: Boolean,
        val deleted: Boolean,
        val nsfw: Boolean,
        val locked: Boolean,
        val stickied: Boolean,
        val reason: String,
        val auth: String?
    )
}

@Serializable
@SerialName("EditPost")
class EditPostResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val edit_id: Int,
        val creator_id: Int,
        val community_id: Int,
        val name: String,
        val url: String?,
        val body: String?,
        val removed: Boolean,
        val deleted: Boolean,
        val nsfw: Boolean,
        val locked: Boolean,
        val stickied: Boolean,
        val reason: String,
        val auth: String?
    )
}