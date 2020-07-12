package com.eiknat.lemmyclient.api.post

import com.eiknat.lemmyclient.api.GetOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("GetPost")
class GetPost(val data: Data): GetOp() {

    @Serializable
    data class Data(
        val id: Int,
        val auth: String?
    )
}
