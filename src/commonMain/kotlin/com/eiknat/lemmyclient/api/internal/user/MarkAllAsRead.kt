package com.eiknat.lemmyclient.api.internal.user

import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("MarkAllAsRead")
class MarkAllAsReadRequest(val data: Data) : RequestOp() {

    @Serializable
    data class Data(
        val auth: String
    )
}

@Serializable
@SerialName("MarkAllAsRead")
class MarkAllAsReadResponse(val data: Data) : ResponseOp() {

    @Serializable
    data class Data(
        val auth: String
    )
}
