package com.eiknat.lemmyclient.api.privatemessage.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PrivateMessageForm(
    val content: String,
    @SerialName("recipient_id")
    val recipientId: Int,
    override val auth: String
): RequireAuthentication
