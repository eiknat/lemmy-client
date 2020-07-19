package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("AddModToCommunity")
class AddModToCommunityRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val community_id: Int,
        val user_id: Int,
        val added: Boolean,
        val auth: String?
    )
}

@Serializable
@SerialName("AddModToCommunity")
class AddModToCommunityResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val community_id: Int,
        val user_id: Int,
        val added: Boolean,
        val auth: String?
    )
}
