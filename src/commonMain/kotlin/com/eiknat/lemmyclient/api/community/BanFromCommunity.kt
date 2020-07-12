package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("BanFromCommunity")
class BanFromCommunity(val data: Data): Op() {

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
