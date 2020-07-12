package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("ListCommunities")
class ListCommunities(val data: Data): Op() {

    @Serializable
    data class Data(
        val sort: String,
        val page: Int?,
        val limit: Int?,
        val auth: String?
    )
}
