package com.eiknat.lemmyclient.api.post.form

import com.eiknat.lemmyclient.api.ListingType
import com.eiknat.lemmyclient.api.SortType
import com.eiknat.lemmyclient.api.auth.OptionalAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetPostsForm(
    @SerialName("type_")
    val type: ListingType,
    val sort: SortType,
    val page: Int?,
    val limit: Int?,
    @SerialName("community_id")
    val communityId: Int?,
    @SerialName("community_name")
    val communityName: String?,
    override val auth: String?
): OptionalAuthentication

internal fun GetPostsForm.toParams() = mapOf(
    Pair("type_", type.type),
    Pair("sort", sort.type),
    Pair("page", page?.toString()),
    Pair("limit", limit?.toString()),
    Pair("community_id", communityId?.toString()),
    Pair("community_name", communityName),
    Pair("auth", auth)
)
