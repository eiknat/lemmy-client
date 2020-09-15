package com.eiknat.lemmyclient.api.modlog.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModRemoveCommunity(
    val id: Int,
    @SerialName("mod_user_id")
    val modUserId: Int,
    @SerialName("community_id")
    val communityId: Int,
    val reason: String?,
    val removed: Boolean = false,
    val expires: String?,
    @SerialName("when_")
    val actionDate: String,
    @SerialName("mod_user_name")
    val modUserName: String,
    @SerialName("community_name")
    val communityName: String,
)
