package com.eiknat.lemmyclient.api.user.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetRepliesForm(
    val sort: String,
    val page: Int?,
    val limit: Int?,
    @SerialName("unread_only")
    val unreadOnly: Boolean,
    override val auth: String,
): RequireAuthentication

internal fun GetRepliesForm.toParams() = mapOf(
    Pair("sort", sort.toString()),
    Pair("page", page.toString()),
    Pair("limit", limit.toString()),
    Pair("unread_only", unreadOnly.toString()),
    Pair("auth", auth),
)
