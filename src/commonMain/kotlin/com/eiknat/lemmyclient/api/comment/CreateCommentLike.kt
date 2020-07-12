package com.eiknat.lemmyclient.api.comment

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CreateCommentLike")
class CreateCommentLike(val data: Data): Op() {

    @Serializable
    data class Data(
        val comment_id: Int,
        val post_id: Int,
        val score: Int,
        val auth: String
    )
}
