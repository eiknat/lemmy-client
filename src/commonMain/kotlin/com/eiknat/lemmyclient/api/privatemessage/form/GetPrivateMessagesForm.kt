package com.eiknat.lemmyclient.api.privatemessage.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetPrivateMessagesForm(
    @SerialName("unread_only")
    val unreadOnly: Boolean,
    val page: Int?,
    val limit: Int?,
    override val auth: String
): RequireAuthentication

internal fun GetPrivateMessagesForm.toParams() = mapOf(
    Pair("unread_only", unreadOnly.toString()),
    Pair("page", page?.toString()),
    Pair("limit", limit?.toString()),
    Pair("auth", auth)
)
