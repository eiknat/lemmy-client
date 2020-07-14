package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("Login")
class LoginRequest(val data: Data): RequestOp() {

    @Serializable
    data class Data(
        val username_or_email: String,
        val password: String
    )
}

@Serializable
@SerialName("Login")
class LoginResponse(val data: Data): ResponseOp() {

    @Serializable
    data class Data(
        val jwt: String
    )
}
