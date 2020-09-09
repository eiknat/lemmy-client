package com.eiknat.lemmyclient.api.privatemessage.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DeletePrivateMessageForm(
    @SerialName("edit_id")
    val messageId: Int,
    val deleted: Boolean,
    override val auth: String
): RequireAuthentication
