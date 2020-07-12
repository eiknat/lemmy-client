package com.eiknat.lemmyclient.api.user

import kotlinx.serialization.Serializable

@Serializable
class UserJoin(val data: Data) {
    val op: String = "UserJoin"

    @Serializable
    data class Data(
        val auth: String
    )
}
