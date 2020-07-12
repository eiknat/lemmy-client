package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("Login")
class Login(val data: Data): Op() {

    @Serializable
    data class Data(
        val username_or_email: String,
        val password: String
    )
}
