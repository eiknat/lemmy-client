package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("Register")
class RegisterRequest(val data: Data): RequestOp() {

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

@Serializable
@SerialName("Register")
class RegisterResponse(val data: Data): ResponseOp() {

    // TODO idk what this returns right now, plus register doesnt work because captcha
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
