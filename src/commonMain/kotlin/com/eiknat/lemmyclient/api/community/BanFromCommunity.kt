package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("BanFromCommunity")
class BanFromCommunityRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val community_id: Int,
        val user_id: Int,
        val ban: Boolean,
        val reason: String?,
        val expires: Int, // date? will need to import klock i think
        val auth: String?
    )
}

@Serializable
@SerialName("BanFromCommunity")
class BanFromCommunityResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val community_id: Int,
        val user_id: Int,
        val ban: Boolean,
        val reason: String?,
        val expires: Int, // date? will need to import klock i think
        val auth: String?
    )
}
