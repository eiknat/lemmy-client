package com.eiknat.lemmyclient.api.community

import kotlinx.serialization.Serializable

@Serializable
class BanFromCommunity(val data: Data) {
    val op: String = "BanFromCommunity"

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
