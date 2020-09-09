package com.eiknat.lemmyclient.api.modlog.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModLogResponse(
    @SerialName("removed_posts")
    val removedPosts: String,
    @SerialName("locked_posts")
    val lockedPosts: String,
    @SerialName("stickied_posts")
    val stickiedPosts: String,
    @SerialName("removed_comments")
    val removedComments: String,
    @SerialName("removed_communities")
    val removedCommunities: String,
    @SerialName("banned_from_community")
    val bannedFromCommunity: String,
    val banned: String,
    @SerialName("added_to_community")
    val addedToCommunity: String,
    val added: String
)