package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("BanUser")
class BanUser(val data: Data): Op() {

    @Serializable
    data class Data(
        val user_id: Int,
        val ban: Boolean,
        val reason: String,
        val expires: Int, // date
        val auth: String
    )
}
