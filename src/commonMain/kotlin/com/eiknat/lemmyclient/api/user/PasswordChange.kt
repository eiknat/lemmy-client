package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("PasswordChange")
class PasswordChangeRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val token: String,
        val password: String,
        val password_verify: String
    )
}

@Serializable
@SerialName("PasswordChange")
class PasswordChangeResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val token: String,
        val password: String,
        val password_verify: String
    )
}
