package com.eiknat.lemmyclient.api.user.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class DeleteAccountForm(
    val password: String,
    override val auth: String,
): RequireAuthentication
