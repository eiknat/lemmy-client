package com.eiknat.lemmyclient.api.comment

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("GetComments")
class GetCommentsRequest(val data: Data): RequestOp() {

    @Serializable
    data class Data(
        val type_: String,
        val sort: String,
        val page: Int?,
        val limit: Int?,
        val community_id: Int?
    )
}

@Serializable
@SerialName("GetComments")
class GetCommentsResponse(val data: Data): ResponseOp() {

    @Serializable
    data class Data(
        val type_: String,
        val sort: String,
        val page: Int?,
        val limit: Int?,
        val community_id: Int?
    )
}
