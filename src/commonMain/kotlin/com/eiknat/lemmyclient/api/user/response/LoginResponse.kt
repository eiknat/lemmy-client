package com.eiknat.lemmyclient.api.user.response

import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(val jwt: String)
