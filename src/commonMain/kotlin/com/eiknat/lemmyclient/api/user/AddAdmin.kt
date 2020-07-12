package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("AddAdmin")
class AddAdmin(val data: Data): Op() {

    @Serializable
    data class Data(
        val user_id: Int,
        val added: Boolean,
        val auth: String
    )
}
