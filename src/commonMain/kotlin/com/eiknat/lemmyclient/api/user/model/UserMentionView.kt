package com.eiknat.lemmyclient.api.user.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserMentionView(
    val id: Int,
    @SerialName("user_mention_id")
    val userMentionId: Int,
    @SerialName("creator_id")
    val creatorId: Int,
    @SerialName("creator_actor_id")
    val creatorActorId: String,
    @SerialName("creator_local")
    val creatorLocal: Boolean,
    @SerialName("post_id")
    val postId: Int,
    @SerialName("post_name")
    val postName: String,
    @SerialName("parent_id")
    val parent_id: Int?,
    val content: String,
    val removed: Boolean,
    val read: Boolean,
    val published: String,
    val updated: String?,
    val deleted: Boolean,
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
    val banned: Boolean,
    @SerialName("banned_from_community")
    val bannedFromCommunity: Boolean,
    @SerialName("creator_name")
    val creatorName: String,
    @SerialName("creator_preferred_username")
    val creatorPreferredUsername: String?,
    @SerialName("creator_avatar")
    val creatorAvatar: String?,
    val score: Int,
    val upvotes: Int,
    val downvotes: Int,
    @SerialName("hot_rank")
    val hotRank: Int,
    @SerialName("hot_rank_active")
    val hotRankActive: Int,
    @SerialName("user_id")
    val userId: Int?,
    @SerialName("my_vote")
    val myVote: Int?,
    val saved: Boolean,
    @SerialName("recipient_id")
    val recipientId: Int,
    @SerialName("recipient_actor_id")
    val recipientActorId: String,
    @SerialName("recipient_local")
    val recipientLocal: Boolean,
)
