package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("FollowCommunity")
class FollowCommunityRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val community_id: Int,
        val follow: Boolean,
        val auth: String?
    )
}

@Serializable
@SerialName("FollowCommunity")
class FollowCommunityResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val community_id: Int,
        val follow: Boolean,
        val auth: String?
    )
}
