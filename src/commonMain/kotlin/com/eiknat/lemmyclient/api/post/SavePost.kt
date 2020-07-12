package com.eiknat.lemmyclient.api.post

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("SavePost")
class SavePost(val data: Data): Op() {

    @Serializable
    data class Data(
        val post_id: Int,
        val save: Boolean,
        val auth: String
    )
}
