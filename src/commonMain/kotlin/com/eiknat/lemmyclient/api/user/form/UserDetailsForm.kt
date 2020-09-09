package com.eiknat.lemmyclient.api.user.form

import com.eiknat.lemmyclient.api.auth.OptionalAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserDetailsForm(
    @SerialName("user_id")
    val userId: Int?,
    val username: String?,
    val sort: String,
    val page: Int?,
    val limit: Int?,
    @SerialName("community_id")
    val communityId: Int?,
    @SerialName("saved_only")
    val savedOnly: Boolean,
    override val auth: String?,
): OptionalAuthentication

internal fun UserDetailsForm.toParams() = mapOf(
    Pair("user_id", userId.toString()),
    Pair("username", username),
    Pair("sort", sort.toString()),
    Pair("page", page.toString()),
    Pair("limit", limit.toString()),
    Pair("community_id", communityId.toString()),
    Pair("saved_only", savedOnly.toString()),
)
