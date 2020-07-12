package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.GetRequest
import kotlinx.serialization.Serializable

@Serializable
class GetCommunity(val data: Data): GetRequest {
    val op: String = "GetCommunity"

    @Serializable
    data class Data(
        val id: Int,
        val name: String?,
        val auth: String?
    )
}
