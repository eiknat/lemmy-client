package com.eiknat.lemmyclient.api.internal.post

import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CreatePostLike")
class CreatePostLikeRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val post_id: Int,
        val score: Int,
        val auth: String
    )
}

@Serializable
@SerialName("CreatePostLike")
class CreatePostLikeResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val post_id: Int,
        val score: Int,
        val auth: String
    )
}
