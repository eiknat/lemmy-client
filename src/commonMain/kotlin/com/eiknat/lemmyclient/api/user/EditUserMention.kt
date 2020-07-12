package com.eiknat.lemmyclient.api.user

import kotlinx.serialization.Serializable

@Serializable
class EditUserMention(val data: Data) {
    val op: String = "EditUserMention"

    @Serializable
    data class Data(
        val user_mention_id: Int,
        val read: Boolean,
        val auth: String
    )
}
