package com.eiknat.lemmyclient.api.internal.community

import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("GetFollowedCommunities")
class GetFollowedCommunitiesRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val auth: String
    )
}

@Serializable
@SerialName("GetFollowedCommunities")
class GetFollowedCommunitiesResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val auth: String
    )
}
