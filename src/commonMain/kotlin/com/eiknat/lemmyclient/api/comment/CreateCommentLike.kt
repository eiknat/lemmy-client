package com.eiknat.lemmyclient.api.comment

import kotlinx.serialization.Serializable

@Serializable
class CreateCommentLike(val data: Data) {
    val op: String = "CreateCommentLike"

    @Serializable
    data class Data(
        val comment_id: Int,
        val post_id: Int,
        val score: Int,
        val auth: String
    )
}
