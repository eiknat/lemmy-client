package com.eiknat.lemmyclient.api.user

import kotlinx.serialization.Serializable

@Serializable
class Login(val data: Data) {
    val op: String = "Login"

    @Serializable
    data class Data(
        val username_or_email: String,
        val password: String
    )
}
