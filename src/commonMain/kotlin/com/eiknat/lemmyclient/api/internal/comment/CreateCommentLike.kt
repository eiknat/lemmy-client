package com.eiknat.lemmyclient.api.internal.comment

import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CreateCommentLike")
class CreateCommentLikeRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val comment_id: Int,
        val post_id: Int,
        val score: Int,
        val auth: String
    )
}

@Serializable
@SerialName("CreateCommentLike")
class CreateCommentLikeResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val comment_id: Int,
        val post_id: Int,
        val score: Int,
        val auth: String
    )
}
