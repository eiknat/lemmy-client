package com.eiknat.lemmyclient.api.internal.community

import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CreateCommunity")
class CreateCommunityRequest(val data: Data) : RequestOp() {

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

@Serializable
@SerialName("CreateCommunity")
class CreateCommunityResponse(val data: Data) : ResponseOp() {

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

