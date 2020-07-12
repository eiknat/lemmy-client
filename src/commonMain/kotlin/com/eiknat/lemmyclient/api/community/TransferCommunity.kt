package com.eiknat.lemmyclient.api.community

import kotlinx.serialization.Serializable

@Serializable
class TransferCommunity(val data: Data) {
    val op: String = "TransferCommunity"

    @Serializable
    data class Data(
        val community_id: Int,
        val user_id: Int,
        val auth: String
    )
}
