package com.eiknat.lemmyclient.api.post

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("SavePost")
class SavePostRequest(val data: Data): RequestOp() {

    @Serializable
    data class Data(
        val post_id: Int,
        val save: Boolean,
        val auth: String
    )
}

@Serializable
@SerialName("SavePost")
class SavePostResponse(val data: Data): ResponseOp() {

    @Serializable
    data class Data(
        val post_id: Int,
        val save: Boolean,
        val auth: String
    )
}