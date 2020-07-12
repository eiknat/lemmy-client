package com.eiknat.lemmyclient.api.community

import kotlinx.serialization.Serializable

@Serializable
class FollowCommunity(val data: Data) {
    val op: String = "FollowCommunity"

    @Serializable
    data class Data(
        val community_id: Int,
        val follow: Boolean,
        val auth: String?
    )
}
