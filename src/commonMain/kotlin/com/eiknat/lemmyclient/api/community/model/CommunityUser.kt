package com.eiknat.lemmyclient.api.community.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class CommunityUser(
    val id: Int,
    @SerialName("user_id")
    val userId: Int,
    @SerialName("user_actor_id")
    val userActorId: String,
    @SerialName("user_local")
    val userLocal: Boolean,
    @SerialName("user_name")
    val userName: String,
    @SerialName("user_preferred_username")
    val userPreferredUsername: String?,
    val avatar: String?,
    @SerialName("community_id")
    val communityId: Int,
    @SerialName("community_actor_id")
    val communityActorId: String,
    @SerialName("community_local")
    val communityLocal: Boolean,
    @SerialName("community_name")
    val communityName: String,
    @SerialName("community_icon")
    val communityIcon: String?,
    val published: String,
)
