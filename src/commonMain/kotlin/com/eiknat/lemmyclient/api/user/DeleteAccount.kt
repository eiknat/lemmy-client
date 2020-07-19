package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("DeleteAccount")
class DeleteAccountRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val password: String,
        val auth: String
    )
}

@Serializable
@SerialName("DeleteAccount")
class DeleteAccountResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val password: String,
        val auth: String
    )
}