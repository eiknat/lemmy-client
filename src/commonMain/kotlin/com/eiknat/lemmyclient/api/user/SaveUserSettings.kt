package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("SaveUserSettings")
class SaveUserSettingsRequest(val data: Data): RequestOp() {

    @Serializable
    data class Data(
        val show_nsfw: Boolean,
        val theme: String,
        val default_sort_type: Int,
        val default_listing_type: Int,
        val lang: String,
        val avatar: String?,
        val email: String?,
        val matrix_user_id: String?,
        val new_password: String?,
        val new_password_verify: String?,
        val old_password: String?,
        val show_avatars: Boolean,
        val send_notifications_to_email: Boolean,
        val auth: String
    )
}

@Serializable
@SerialName("SaveUserSettings")
class SaveUserSettingsResponse(val data: Data): ResponseOp() {

    @Serializable
    data class Data(
        val show_nsfw: Boolean,
        val theme: String,
        val default_sort_type: Int,
        val default_listing_type: Int,
        val lang: String,
        val avatar: String?,
        val email: String?,
        val matrix_user_id: String?,
        val new_password: String?,
        val new_password_verify: String?,
        val old_password: String?,
        val show_avatars: Boolean,
        val send_notifications_to_email: Boolean,
        val auth: String
    )
}