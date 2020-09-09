package com.eiknat.lemmyclient.api.user.form

import kotlinx.serialization.Serializable

@Serializable
data class PasswordResetForm(val email: String)
