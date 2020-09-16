package com.eiknat.lemmyclient.api.user.form

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RegisterForm(
    val username: String,
    val email: String?,
    val password: String,
    @SerialName("password_verify")
    val passwordVerify: String,
    val admin: Boolean = false,
    @SerialName("show_nsfw")
    val showNsfw: Boolean,
    @SerialName("captcha_uuid")
    val captchaUuid: String?,
    @SerialName("captcha_answer")
    val captchaAnswer: String?
)
