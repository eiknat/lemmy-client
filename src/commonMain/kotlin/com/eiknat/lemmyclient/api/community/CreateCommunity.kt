package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CreateCommunity")
class CreateCommunity(val data: Data): Op() {

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
