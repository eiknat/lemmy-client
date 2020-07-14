package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("PasswordReset")
class PasswordResetRequest(val data: Data): RequestOp() {

    @Serializable
    data class Data(
        val email: String
    )
}

@Serializable
@SerialName("PasswordReset")
class PasswordResetResponse(val data: Data): ResponseOp() {

    // this is actually empty, so there's nothing to deserialize
    @Serializable
    data class Data(
        val email: String
    )
}
