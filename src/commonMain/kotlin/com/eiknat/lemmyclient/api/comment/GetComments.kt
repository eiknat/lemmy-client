package com.eiknat.lemmyclient.api.comment

import com.eiknat.lemmyclient.api.GetRequest
import kotlinx.serialization.Serializable

@Serializable
class GetComments(val data: Data): GetRequest {
    val op: String = "GetComments"

    @Serializable
    data class Data(
        val type_: String,
        val sort: String,
        val page: Int?,
        val limit: Int?,
        val community_id: Int?
    )
}
