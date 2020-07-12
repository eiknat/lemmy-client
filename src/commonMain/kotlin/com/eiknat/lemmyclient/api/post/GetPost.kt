package com.eiknat.lemmyclient.api.post

import com.eiknat.lemmyclient.api.GetRequest
import kotlinx.serialization.Serializable

@Serializable
class GetPost(val data: Data) { // should extend GetRequest, need to write serializer for it

    val op: String = "GetPost"

    @Serializable
    data class Data(
        val id: Int,
        val auth: String?
    )
}
