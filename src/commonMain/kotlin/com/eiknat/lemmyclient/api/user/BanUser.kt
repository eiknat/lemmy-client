package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("BanUser")
class BanUserRequest(val data: Data): RequestOp() {

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
class BanUserResponse(val data: Data): ResponseOp() {

    @Serializable
    data class Data(
        val user_id: Int,
        val ban: Boolean,
        val reason: String,
        val expires: Int, // date
        val auth: String
    )
}