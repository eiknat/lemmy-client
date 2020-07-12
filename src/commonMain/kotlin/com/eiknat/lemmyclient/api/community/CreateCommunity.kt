package com.eiknat.lemmyclient.api.community

import kotlinx.serialization.Serializable

@Serializable
class CreateCommunity(val data: Data) {
    val op: String = "GetCommunity"

    @Serializable
    data class Data(
        val name: String,
        val title: String,
        val description: String?,
        val category_id: Int,
        val nsfw: Boolean,
        val auth: String?
    )
}
