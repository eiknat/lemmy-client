package com.eiknat.lemmyclient.api.post

import kotlinx.serialization.Serializable

@Serializable
class EditPost(val data: Data) {
    val op: String = "EditPost"

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
