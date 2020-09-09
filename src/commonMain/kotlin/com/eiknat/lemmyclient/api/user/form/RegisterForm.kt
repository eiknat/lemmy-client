package com.eiknat.lemmyclient.api.user.form

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RegisterForm(
    val username: String,
    val email: String?,
    val password: String,
    @SerialName("password_verification")
    val passwordVerification: String,
    val admin: Boolean,
    val showNsfw: Boolean,
)
