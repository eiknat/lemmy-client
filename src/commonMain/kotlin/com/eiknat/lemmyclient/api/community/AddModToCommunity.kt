package com.eiknat.lemmyclient.api.community

import kotlinx.serialization.Serializable

@Serializable
class AddModToCommunity(val data: Data) {
    val op: String = "AddModToCommunity"

    @Serializable
    data class Data(
        val community_id: Int,
        val user_id: Int,
        val added: Boolean,
        val auth: String?
    )
}
