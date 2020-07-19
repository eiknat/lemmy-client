package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
@SerialName("UserJoin")
class UserJoinRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val auth: String
    )
}

@Serializable
@SerialName("UserJoin")
class UserJoinResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val user_id: Int
    )
}
