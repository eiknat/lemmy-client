package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("PasswordChange")
class PasswordChange(val data: Data): Op() {

    @Serializable
    data class Data(
        val token: String,
        val password: String,
        val password_verify: String
    )
}
