package com.eiknat.lemmyclient.api.comment

import com.eiknat.lemmyclient.api.GetOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("GetComments")
class GetComments(val data: Data): GetOp() {

    @Serializable
    data class Data(
        val type_: String,
        val sort: String,
        val page: Int?,
        val limit: Int?,
        val community_id: Int?
    )
}
