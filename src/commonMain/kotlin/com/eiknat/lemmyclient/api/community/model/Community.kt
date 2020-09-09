package com.eiknat.lemmyclient.api.community.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Community(
    val id: Int,
    @SerialName("actor_id")
    val actorId: String,
    val local: Boolean,
    val name: String,
    val title: String,
    val icon: String?,
    val banner: String?,
    val description: String?,
    @SerialName("category_id")
    val categoryId: Int,
    @SerialName("creator_id")
    val creatorId: Int,
    val removed: Boolean,
    val deleted: Boolean,
    val nsfw: Boolean,
    val published: String,
    val updated: String?,
    @SerialName("creator_actor_id")
    val creatorActorId: String,
    @SerialName("creator_local")
    val creatorLocal: Boolean,
    @SerialName("last_refreshed_at")
    val lastRefreshedAt: String,
    @SerialName("creator_name")
    val creatorName: String,
    @SerialName("creator_preferred_username")
    val creatorPreferredUsername: String?,
    @SerialName("creator_avatar")
    val creatorAvatar: String?,
    @SerialName("category_name")
    val categoryName: String,
    @SerialName("number_of_subscribers")
    val numberOfSubscribers: Int,
    @SerialName("number_of_posts")
    val numberOfPosts: Int,
    @SerialName("number_of_comments")
    val numberOfComments: Int,
    @SerialName("user_id")
    val userId: Int?,
    val subscribed: Boolean?,
)
