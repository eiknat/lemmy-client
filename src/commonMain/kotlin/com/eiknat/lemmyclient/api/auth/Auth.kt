package com.eiknat.lemmyclient.api.auth

import kotlinx.serialization.Serializable

@Serializable
data class Auth(override val auth: String): RequireAuthentication

internal fun Auth.toParams() = mapOf(Pair("auth", auth))
