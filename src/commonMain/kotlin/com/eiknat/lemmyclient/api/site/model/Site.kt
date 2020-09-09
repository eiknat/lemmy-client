package com.eiknat.lemmyclient.api.site.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Site (
    val id: Int,
    val name: String,
    val description: String?,
    @SerialName("creator_id")
    val creatorId: Int,
    val published: String,
    val updated: String?,
    @SerialName("creator_name")
    val creatorName: String,
    @SerialName("creator_preferred_username")
    val creatorPreferredUsername: String?,
    @SerialName("number_of_users")
    val numberOfUsers: Int,
    @SerialName("number_of_posts")
    val numberOfPosts: Int,
    @SerialName("number_of_comments")
    val numberOfComments: Int,
    @SerialName("number_of_communities")
    val numberOfCommunities: Int,
    @SerialName("enable_downvotes")
    val enableDownvotes: Boolean,
    @SerialName("open_registration")
    val openRegistration: Boolean,
    @SerialName("enable_nsfw")
    val enableNsfw: Boolean,
    val icon: String?,
    val banner: String?,
)
