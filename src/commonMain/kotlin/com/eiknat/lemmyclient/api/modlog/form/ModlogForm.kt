package com.eiknat.lemmyclient.api.modlog.form

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModlogForm(
    @SerialName("mod_user_id")
    val modUserId: Int?,
    @SerialName("community_id")
    val communityId: Int?,
    val page: Int?,
    val limit: Int?
)

internal fun ModlogForm.toParams() = mapOf(
    Pair("mod_user_id", modUserId?.toString()),
    Pair("community_id", communityId?.toString()),
    Pair("page", page?.toString()),
    Pair("limit", limit?.toString())
)
