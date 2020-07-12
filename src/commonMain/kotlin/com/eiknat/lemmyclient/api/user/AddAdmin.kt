package com.eiknat.lemmyclient.api.user

import kotlinx.serialization.Serializable

@Serializable
class AddAdmin(val data: Data) {
    val op: String = "AddAdmin"

    @Serializable
    data class Data(
        val user_id: Int,
        val added: Boolean,
        val auth: String
    )
}
