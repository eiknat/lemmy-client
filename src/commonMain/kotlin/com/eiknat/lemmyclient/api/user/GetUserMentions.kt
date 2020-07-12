package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("GetUserMentions")
class GetUserMentions(val data: Data): Op() {

    @Serializable
    data class Data(
        val sort: String,
        val page: Int?,
        val limit: Int?,
        val unread_only: Boolean,
        val auth: String
    )
}
