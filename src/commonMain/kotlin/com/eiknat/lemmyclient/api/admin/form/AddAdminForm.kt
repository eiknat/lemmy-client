package com.eiknat.lemmyclient.api.admin.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AddAdminForm(
    @SerialName("user_id")
    val userId: Int,
    @SerialName("added")
    val add: Boolean,
    override val auth: String
): RequireAuthentication
