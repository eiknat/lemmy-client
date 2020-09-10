package com.eiknat.lemmyclient.api.user.form

import com.eiknat.lemmyclient.api.SortType
import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserMentionsForm(
    val sort: SortType,
    val page: Int?,
    val limit: Int?,
    @SerialName("unread_only")
    val unreadOnly: Boolean,
    override val auth: String
): RequireAuthentication

internal fun UserMentionsForm.toParams() = mapOf(
    Pair("sort", sort.type),
    Pair("page", page.toString()),
    Pair("limit", limit.toString()),
    Pair("unread_only", unreadOnly.toString()),
    Pair("auth", auth),
)
