package com.eiknat.lemmyclient.api.post

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CreatePostLike")
class CreatePostLike(val data: Data): Op() {

    @Serializable
    data class Data(
        val post_id: Int,
        val score: Int,
        val auth: String
    )
}
