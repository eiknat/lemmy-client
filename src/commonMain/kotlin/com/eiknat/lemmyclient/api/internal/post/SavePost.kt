package com.eiknat.lemmyclient.api.internal.post

import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("SavePost")
class SavePostRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val post_id: Int,
        val save: Boolean,
        val auth: String
    )
}

@Serializable
@SerialName("SavePost")
class SavePostResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val post_id: Int,
        val save: Boolean,
        val auth: String
    )
}