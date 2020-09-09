package com.eiknat.lemmyclient.api.user.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarkUserMentionAsReadForm(
    @SerialName("user_mention_id")
    val userMentionId: Int,
    val read: Boolean,
    override val auth: String,
): RequireAuthentication
