package com.eiknat.lemmyclient.api.internal.user

import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("Login")
class LoginRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val username_or_email: String,
        val password: String
    )
}

@Serializable
@SerialName("Login")
class LoginResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val jwt: String
    )
}
