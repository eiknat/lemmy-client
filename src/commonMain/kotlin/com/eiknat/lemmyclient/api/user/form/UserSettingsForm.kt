package com.eiknat.lemmyclient.api.user.form

import com.eiknat.lemmyclient.api.ListingType
import com.eiknat.lemmyclient.api.SortType
import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserSettingsForm(
    @SerialName("show_nsfw")
    val showNsfw: Boolean,
    val theme: String,
    @SerialName("default_sort_type")
    val defaultSortType: SortType,
    @SerialName("default_listing_type")
    val defaultListingType: ListingType,
    val lang: String,
    val avatar: String?,
    val email: String?,
    @SerialName("matrix_user_id")
    val matrixUserId: String?,
    @SerialName("new_password")
    val newPassword: String?,
    @SerialName("new_password_verify")
    val newPasswordVerify: String?,
    @SerialName("old_password")
    val oldPassword: String?,
    @SerialName("show_avatars")
    val showAvatars: Boolean,
    @SerialName("send_notifications_to_email")
    val sendNotificationsToEmail: Boolean,
    override val auth: String,
): RequireAuthentication
