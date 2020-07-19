package com.eiknat.lemmyclient.api.comment

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("SaveComment")
class SaveCommentRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val comment_id: Int,
        val save: Boolean,
        val auth: String
    )
}

@Serializable
@SerialName("SaveComment")
class SaveCommentResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val comment_id: Int,
        val save: Boolean,
        val auth: String
    )
}
