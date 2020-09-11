package com.eiknat.lemmyclient.api.user.model

import com.eiknat.lemmyclient.api.ListingType
import com.eiknat.lemmyclient.api.SortType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: Int,
    val name: String,
    @SerialName("preferred_user_name")
    val preferredUsername: String,
    val email: String?,
    val avatar: String?,
    val banner: String?,
    val admin: Boolean,
    val banned: Boolean,
    val published: String, // date
    val updated: String, // also date
    @SerialName("show_nsfw")
    val showNsfw: Boolean,
    val theme: String,
    @SerialName("default_sort_type")
    val defaultSortType: SortType,
    @SerialName("default_listing_type")
    val defaultListingType: ListingType,
    @SerialName("matrix_user_id")
    val lang: String,
    @SerialName("show_avatars")
    val showAvatars: Boolean,
    @SerialName("send_notifications_to_email")
    val sendNotificationsToEmail: Boolean,
    val matrixUserId: String?,
    @SerialName("actor_id")
    val actorId: String,
    val bio: String?,
    val local: Boolean,
    @SerialName("last_refreshed_at")
    val lastRefreshedAt: String,
)
