package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("MarkAllAsRead")
class MarkAllAsRead(val data: Data): Op() {

    @Serializable
    data class Data(
        val auth: String
    )
}
