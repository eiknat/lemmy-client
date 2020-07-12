package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("TransferCommunity")
class TransferCommunity(val data: Data): Op() {

    @Serializable
    data class Data(
        val community_id: Int,
        val user_id: Int,
        val auth: String
    )
}
