package com.eiknat.lemmyclient.api.user

import kotlinx.serialization.Serializable

@Serializable
class PasswordReset(val data: Data) {
    val op: String = "PasswordReset"

    @Serializable
    data class Data(
        val email: String
    )
}
