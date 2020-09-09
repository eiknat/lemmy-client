package com.eiknat.lemmyclient.api.user.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BanUserForm(
    @SerialName("user_id")
    val userId: Int,
    @SerialName("ban")
    val isBanned: Boolean,
    @SerialName("remove_data")
    val removeData: Boolean,
    val reason: String?,
    val expires: String?,
    override val auth: String,
): RequireAuthentication
