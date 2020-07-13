package com.eiknat.lemmyclient.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Comment(
    val id: Int,
    @SerialName("creator_id")
    val creatorId: Int,
    @SerialName("post_id")
    val postId: Int,
    @SerialName("parent_id")
    val parentId: Int,
    val content: String,
    val removed: Boolean,
    val read: Boolean,
    val published: String,
    val updated: String?,
    val deleted: Boolean,
    @SerialName("ap_id")
    val apId: String,
    val local: Boolean,
    @SerialName("community_id")
    val communityId: Int,
    @SerialName("community_actor_id")
    val communityActorId: String,
    @SerialName("community_local")
    val communityLocal: Boolean,
    @SerialName("community_name")
    val communityName: String,
    val banned: Boolean,
    @SerialName("banned_from_community")
    val bannedFromCommunity: Boolean,
    @SerialName("creator_actor_id")
    val creatorActorId: String,
    @SerialName("creator_local")
    val creatorLocal: Boolean,
    @SerialName("creator_name")
    val creatorName: String,
    @SerialName("creator_avatar")
    val creatorAvatar: String,
    val score: Int,
    val upvotes: Int,
    val downvotes: Int,
    @SerialName("hot_rank")
    val hotRank: Int,
    @SerialName("user_id")
    val userId: Int,
    @SerialName("my_vote")
    val myVote: Int,
    val subscribed: Boolean,
    val saved: Boolean
)