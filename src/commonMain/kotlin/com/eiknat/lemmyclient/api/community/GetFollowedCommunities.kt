package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.GetOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("GetFollowedCommunities")
class GetFollowedCommunities(val data: Data): GetOp() {

    @Serializable
    data class Data(
        val auth: String
    )
}
