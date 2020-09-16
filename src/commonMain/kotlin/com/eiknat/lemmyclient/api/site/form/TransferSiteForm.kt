package com.eiknat.lemmyclient.api.site.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TransferSiteForm(
    @SerialName("user_id")
    val userId: Int,
    override val auth: String
): RequireAuthentication
