package com.eiknat.lemmyclient.api.comment

import kotlinx.serialization.Serializable

@Serializable
class SaveComment(val data: Data) {
    val op: String = "SaveComment"

    @Serializable
    data class Data(
        val comment_id: Int,
        val save: Boolean,
        val auth: String
    )
}
