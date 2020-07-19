package com.eiknat.lemmyclient.api.internal.community

import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("TransferCommunity")
class TransferCommunityRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val community_id: Int,
        val user_id: Int,
        val auth: String
    )
}

@Serializable
@SerialName("TransferCommunity")
class TransferCommunityResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val community_id: Int,
        val user_id: Int,
        val auth: String
    )
}
