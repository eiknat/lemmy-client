package com.eiknat.lemmyclient.api.modlog.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModLockPost(
    val id: Int,
    @SerialName("mod_user_id")
    val modUserId: Int,
    @SerialName("post_id")
    val postId: Int,
    val locked: Boolean = false,
    val when_: String,
    @SerialName("mod_user_name")
    val modUserName: String,
    @SerialName("post_name")
    val postName: String,
    @SerialName("community_id")
    val communityId: Int,
    @SerialName("community_name")
    val communityName: String,
)
