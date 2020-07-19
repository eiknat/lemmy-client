package com.eiknat.lemmyclient.api.internal.community

import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("EditCommunity")
class EditCommunityRequest(val data: Data) : RequestOp() {

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

@Serializable
@SerialName("EditCommunity")
class EditCommunityResponse(val data: Data) : ResponseOp() {

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
