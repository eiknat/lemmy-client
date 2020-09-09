package com.eiknat.lemmyclient.api.privatemessage.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarkPrivateMessageAsReadForm(
    @SerialName("edit_id")
    val messageId: Int,
    val read: Boolean,
    override val auth: String,
): RequireAuthentication
