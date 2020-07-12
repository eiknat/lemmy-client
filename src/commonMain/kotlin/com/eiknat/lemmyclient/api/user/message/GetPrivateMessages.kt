package com.eiknat.lemmyclient.api.user.message

import com.eiknat.lemmyclient.api.GetRequest
import kotlinx.serialization.Serializable

@Serializable
class GetPrivateMessages(val data: Data): GetRequest {
    val op: String = "GetPrivateMessages"

    @Serializable
    data class Data(
        val unread_only: Boolean,
        val page: Int?,
        val limit: Int?,
        val auth: String
    )
}
