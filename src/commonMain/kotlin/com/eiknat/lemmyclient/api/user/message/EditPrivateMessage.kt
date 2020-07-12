package com.eiknat.lemmyclient.api.user.message

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("EditPrivateMessage")
class EditPrivateMessage(val data: Data): Op() {

    @Serializable
    data class Data(
        val edit_id: Int,
        val content: String?,
        val deleted: Boolean,
        val read: Boolean,
        val auth: String
    )
}
