package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("Register")
class Register(val data: Data): Op() {

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
