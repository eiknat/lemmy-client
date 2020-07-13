package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("ListCommunities")
class ListCommunitiesRequest(val data: Data): RequestOp() {

    @Serializable
    data class Data(
        val sort: String,
        val page: Int?,
        val limit: Int?,
        val auth: String?
    )
}

@Serializable
@SerialName("ListCommunities")
class ListCommunitiesResponse(val data: Data): ResponseOp() {

    @Serializable
    data class Data(
        val sort: String,
        val page: Int?,
        val limit: Int?,
        val auth: String?
    )
}