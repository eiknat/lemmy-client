package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("DeleteAccount")
class DeleteAccount(val data: Data): Op() {

    @Serializable
    data class Data(
        val password: String,
        val auth: String
    )
}
