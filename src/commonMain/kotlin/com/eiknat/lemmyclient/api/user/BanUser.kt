package com.eiknat.lemmyclient.api.user

import kotlinx.serialization.Serializable

@Serializable
class BanUser(val data: Data) {
    val op: String = "BanUser"

    @Serializable
    data class Data(
        val user_id: Int,
        val ban: Boolean,
        val reason: String,
        val expires: Int, // date
        val auth: String
    )
}
