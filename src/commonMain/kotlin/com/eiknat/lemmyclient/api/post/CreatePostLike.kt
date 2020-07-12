package com.eiknat.lemmyclient.api.post

import kotlinx.serialization.Serializable

@Serializable
class CreatePostLike(val data: Data) {
    val op: String = "CreatePostLike"

    @Serializable
    data class Data(
        val post_id: Int,
        val score: Int,
        val auth: String
    )
}
