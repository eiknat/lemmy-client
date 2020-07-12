package com.eiknat.lemmyclient.api.comment

import kotlinx.serialization.Serializable

@Serializable
class CreateComment(val data: Data) {
    val op: String = "CreateComment"

    @Serializable
    data class Data(
        val content: String,
        val parent_id: Int?,
        val edit_id: Int?,
        val post_id: Int,
        val auth: String?
    )
}
