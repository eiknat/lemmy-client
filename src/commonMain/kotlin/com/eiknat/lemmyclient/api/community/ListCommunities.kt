package com.eiknat.lemmyclient.api.community

import kotlinx.serialization.Serializable

@Serializable
class ListCommunities(val data: Data) {
    val op: String = "ListCommunities"

    @Serializable
    data class Data(
        val sort: String,
        val page: Int?,
        val limit: Int?,
        val auth: String?
    )
}
