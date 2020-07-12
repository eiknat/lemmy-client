package com.eiknat.lemmyclient.api.comment

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("SaveComment")
class SaveComment(val data: Data): Op() {

    @Serializable
    data class Data(
        val comment_id: Int,
        val save: Boolean,
        val auth: String
    )
}
