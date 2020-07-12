package com.eiknat.lemmyclient.api.user

import kotlinx.serialization.Serializable

@Serializable
class PasswordChange(val data: Data) {
    val op: String = "GetReplies"

    @Serializable
    data class Data(
        val token: String,
        val password: String,
        val password_verify: String
    )
}
