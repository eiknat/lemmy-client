package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("GetCommunity")
class GetCommunityRequest(val data: Data): RequestOp() {

    @Serializable
    data class Data(
        val id: Int,
        val name: String?,
        val auth: String?
    )
}

@Serializable
@SerialName("GetCommunity")
class GetCommunityResponse(val data: Data): ResponseOp() {

    @Serializable
    data class Data(
        val id: Int,
        val name: String?,
        val auth: String?
    )
}
