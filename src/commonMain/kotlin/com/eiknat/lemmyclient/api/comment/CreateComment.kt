package com.eiknat.lemmyclient.api.comment

import com.eiknat.lemmyclient.api.Op
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CreateComment")
class CreateComment(val data: Data): Op() {

    @Serializable
    data class Data(
        val content: String,
        val creator_id: Int,
        val parent_id: Int?,
        val edit_id: Int?,
        val post_id: Int,
        val auth: String?
    )
}
