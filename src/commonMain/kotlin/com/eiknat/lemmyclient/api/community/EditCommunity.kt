package com.eiknat.lemmyclient.api.community

import kotlinx.serialization.Serializable

@Serializable
class EditCommunity(val data: Data) {
    val op: String = "EditCommunity"

    @Serializable
    data class Data(
        val edit_id: Int,
        val name: String,
        val title: String,
        val description: String?,
        val category_id: Int,
        val removed: Boolean,
        val deleted: Boolean,
        val nsfw: Boolean,
        val reason: String,
        val expires: Int, // date
        val auth: String?
    )
}
