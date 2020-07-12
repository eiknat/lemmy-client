package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.GetRequest
import kotlinx.serialization.Serializable

@Serializable
class GetUserMentions(val data: Data): GetRequest {
    val op: String = "GetUserMentions"

    @Serializable
    data class Data(
        val sort: String,
        val page: Int?,
        val limit: Int?,
        val unread_only: Boolean,
        val auth: String
    )
}
