package com.eiknat.lemmyclient.api.user.message

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("GetPrivateMessages")
class GetPrivateMessages(val data: Data): Op() {

    @Serializable
    data class Data(
        val unread_only: Boolean,
        val page: Int?,
        val limit: Int?,
        val auth: String
    )
}
