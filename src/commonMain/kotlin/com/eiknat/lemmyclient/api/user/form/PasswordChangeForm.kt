package com.eiknat.lemmyclient.api.user.form

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PasswordChangeForm(
    val token: String,
    val password: String,
    @SerialName("password_verify")
    val passwordVerify: String,
)
