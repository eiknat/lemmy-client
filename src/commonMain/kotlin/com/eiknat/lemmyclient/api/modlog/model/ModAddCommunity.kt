package com.eiknat.lemmyclient.api.modlog.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModAddCommunity(
    val id: Int,
    @SerialName("mod_user_id")
    val modUserId: Int,
    @SerialName("other_user_id")
    val targetUserId: Int,
    @SerialName("community_id")
    val communityId: Int,
    val removed: Boolean = false,
    @SerialName("when_")
    val actionDate: String?,
    @SerialName("mod_user_name")
    val modUserName: String,
    @SerialName("other_user_name")
    val targetUserName: String,
    @SerialName("community_name")
    val communityName: String,
)
