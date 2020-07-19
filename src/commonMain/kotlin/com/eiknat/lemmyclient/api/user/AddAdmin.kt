package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("AddAdmin")
class AddAdminRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val user_id: Int,
        val added: Boolean,
        val auth: String
    )
}

@Serializable
@SerialName("AddAdmin")
class AddAdminResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val admins: String // UserView
    )
}