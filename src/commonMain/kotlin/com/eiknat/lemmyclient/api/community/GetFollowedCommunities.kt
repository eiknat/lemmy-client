package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.GetRequest
import kotlinx.serialization.Serializable

@Serializable
class GetFollowedCommunities(val data: Data): GetRequest {
    val op: String = "GetFollowedCommunities"

    @Serializable
    data class Data(
        val auth: String
    )
}
