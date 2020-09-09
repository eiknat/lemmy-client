package com.eiknat.lemmyclient.api.post.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Post(
    val id: Int,
    val name: String,
    val url: String?,
    val body: String?,
    @SerialName("creator_id")
    val creatorId: Int,
    @SerialName("community_id")
    val communityId: Int,
    val removed: Boolean,
    val deleted: Boolean,
    val locked: Boolean,
    val stickied: Boolean,
    @SerialName("embed_title")
    val embedTitle: String?,
    @SerialName("embed_description")
    val embedDescription: String?,
    @SerialName("embed_html")
    val embedHtml: String?,
    @SerialName("thumbnail_url")
    val thumbnailUrl: String?,
    @SerialName("ap_id")
    val apId: String,
    val local: Boolean,
    val nsfw: Boolean,
    val banned: Boolean,
    @SerialName("banned_from_community")
    val bannedFromCommunity: Boolean,
    val published: String,
    val updated: String?,
    @SerialName("creator_actor_id")
    val creatorActorId: String,
    @SerialName("creator_local")
    val creatorLocal: Boolean,
    @SerialName("creator_name")
    val creatorName: String,
    @SerialName("creator_preferred_username")
    val creatorPreferredUsername: String?,
    @SerialName("creator_published")
    val creatorPublished: String,
    @SerialName("creator_avatar")
    val creatorAvatar: String?,
    @SerialName("community_actor_id")
    val communityActorId: String,
    @SerialName("community_local")
    val communityLocal: Boolean,
    @SerialName("community_name")
    val communityName: String,
    @SerialName("community_icon")
    val communityIcon: String?,
    @SerialName("community_removed")
    val communityRemoved: Boolean,
    @SerialName("community_deleted")
    val communityDeleted: Boolean,
    @SerialName("community_nsfw")
    val communityNsfw: Boolean,
    @SerialName("number_of_comments")
    val numberOfComments: Int,
    val score: Int,
    val upvotes: Int,
    val downvotes: Int,
    @SerialName("hot_rank")
    val hotRank: Int,
    @SerialName("hot_rank_active")
    val hotRankActive: Int,
    @SerialName("newest_activity_time")
    val newestActivityTime: String,
    @SerialName("user_id")
    val userId: Int?,
    @SerialName("my_vote")
    val myVote: Int?,
    val subscribed: Boolean,
    val read: Boolean,
    val saved: Boolean,
    val duplicates: List<Post>
)
