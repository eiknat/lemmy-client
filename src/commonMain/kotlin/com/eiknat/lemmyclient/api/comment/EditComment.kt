package com.eiknat.lemmyclient.api.comment

import kotlinx.serialization.Serializable

@Serializable
class EditComment(val data: Data) {
    val op: String = "EditComment"

    @Serializable
    data class Data(
        val content: String,
        val parent_id: Int?,
        val edit_id: Int,
        val creator_id: Int,
        val post_id: Int,
        val removed: Boolean,
        val deleted: Boolean,
        val reason: String,
        val read: Boolean,
        val auth: String
    )
}
