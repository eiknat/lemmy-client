package com.eiknat.lemmyclient.api.user.form

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginForm(
    @SerialName("username_or_email")
    val usernameOrEmail: String,
    @SerialName("password")
    val password: String,
)
