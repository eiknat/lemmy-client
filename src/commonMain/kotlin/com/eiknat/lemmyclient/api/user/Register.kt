package com.eiknat.lemmyclient.api.user

import kotlinx.serialization.Serializable

@Serializable
class Register(val data: Data) {
    val op: String = "Register"

    @Serializable
    data class Data(
        val username: String,
        val email: String?,
        val password: String,
        val password_verify: String,
        val admin: Boolean,
        val show_nsfw: Boolean
    )
}
