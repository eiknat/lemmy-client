package com.eiknat.lemmyclient.api.community.form

import com.eiknat.lemmyclient.api.auth.OptionalAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class ListCommunitiesForm(
    val sort: String, // SortType
    val page: Int?,
    val limit: Int?,
    override val auth: String?
): OptionalAuthentication

internal fun ListCommunitiesForm.asParams() = mapOf(
    Pair("sort", sort),
    Pair("page", page.toString()),
    Pair("limit", limit.toString()),
    Pair("auth", auth)
)
