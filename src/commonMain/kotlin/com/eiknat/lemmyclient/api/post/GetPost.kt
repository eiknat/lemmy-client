package com.eiknat.lemmyclient.api.post

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("GetPost")
class GetPostRequest(val data: Data) : RequestOp() {

    @Serializable
    @SerialName("data")
    data class Data(
        val id: Int,
        val auth: String?
    )
}

@Serializable
@SerialName("GetPost")
class GetPostResponse(val data: Data) : ResponseOp() {

    @Serializable
    @SerialName("data")
    data class Data(
        val id: Int,
        val auth: String?
    )
}