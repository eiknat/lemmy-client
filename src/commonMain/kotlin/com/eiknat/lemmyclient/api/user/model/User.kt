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
    val preferredUsername: String? = null, // this errors if it's null for some reason
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
    val defaultSortType: Int, // should these return SortType/ListingType?
    @SerialName("default_listing_type")
    val defaultListingType: Int,
    val lang: String,
    @SerialName("show_avatars")
    val showAvatars: Boolean,
    @SerialName("send_notifications_to_email")
    val sendNotificationsToEmail: Boolean,
    @SerialName("matrix_user_id")
    val matrixUserId: String?,
    @SerialName("actor_id")
    val actorId: String,
    val bio: String?,
    val local: Boolean,
    @SerialName("last_refreshed_at")
    val lastRefreshedAt: String,
)
