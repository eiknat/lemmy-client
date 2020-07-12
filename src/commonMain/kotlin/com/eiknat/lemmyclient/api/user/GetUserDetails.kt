package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.GetOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("GetUserDetails")
class GetUserDetails(val data: Data): GetOp() {

    @Serializable
    data class Data(
        val user_id: Int?,
        val username: String?,
        val sort: String,
        val page: Int?,
        val limit: Int?,
        val community_id: Int?,
        val saved_only: Boolean,
        val auth: String
    )
}
