package com.eiknat.lemmyclient.api.internal.user

import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("BanUser")
class BanUserRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val user_id: Int,
        val ban: Boolean,
        val reason: String,
        val expires: Int, // date
        val auth: String
    )
}

@Serializable
@SerialName("BanUser")
class BanUserResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val user: String, // UserView
        val banned: Boolean
    )
}
