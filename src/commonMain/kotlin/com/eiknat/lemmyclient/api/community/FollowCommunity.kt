package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("FollowCommunity")
class FollowCommunity(val data: Data): Op() {

    @Serializable
    data class Data(
        val community_id: Int,
        val follow: Boolean,
        val auth: String?
    )
}
