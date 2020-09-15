package com.eiknat.lemmyclient.api.modlog.response

import com.eiknat.lemmyclient.api.modlog.model.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModlogResponse(
    @SerialName("removed_posts")
    val removedPosts: List<ModRemovePost>,
    @SerialName("locked_posts")
    val lockedPosts: List<ModLockPost>,
    @SerialName("stickied_posts")
    val stickiedPosts: List<ModStickyPost>,
    @SerialName("removed_comments")
    val removedComments: List<ModRemoveComment>,
    @SerialName("removed_communities")
    val removedCommunities: List<ModRemoveCommunity>,
    @SerialName("banned_from_community")
    val bannedFromCommunity: List<ModBanFromCommunity>,
    val banned: List<ModBan>,
    @SerialName("added_to_community")
    val addedToCommunity: List<ModAddCommunity>,
    val added: List<ModAdd>
)
