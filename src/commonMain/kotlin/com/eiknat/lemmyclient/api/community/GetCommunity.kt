package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("GetCommunity")
class GetCommunity(val data: Data): Op() {

    @Serializable
    data class Data(
        val id: Int,
        val name: String?,
        val auth: String?
    )
}
