package com.eiknat.lemmyclient.api.user

import kotlinx.serialization.Serializable

@Serializable
class DeleteAccount {
    val op: String = "DeleteAccount"

    @Serializable
    data class Data(
        val password: String,
        val auth: String
    )
}
