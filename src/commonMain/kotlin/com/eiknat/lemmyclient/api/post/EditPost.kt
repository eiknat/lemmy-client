package com.eiknat.lemmyclient.api.post

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("EditPost")
class EditPost(val data: Data): Op() {

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
