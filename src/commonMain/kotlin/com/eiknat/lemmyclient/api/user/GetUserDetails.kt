package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.GetRequest
import kotlinx.serialization.Serializable

@Serializable
class GetUserDetails(val data: Data): GetRequest {
    val op: String = "GetUserDetails"

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
