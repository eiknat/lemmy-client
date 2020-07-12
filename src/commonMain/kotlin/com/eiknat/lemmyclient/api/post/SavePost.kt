package com.eiknat.lemmyclient.api.post

import kotlinx.serialization.Serializable

@Serializable
class SavePost(val data: Data) {
    val op: String = "SavePost"

    @Serializable
    data class Data(
        val post_id: Int,
        val save: Boolean,
        val auth: String
    )
}
