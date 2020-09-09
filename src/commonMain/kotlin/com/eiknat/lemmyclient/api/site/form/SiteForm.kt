package com.eiknat.lemmyclient.api.site.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SiteForm(
    val name: String,
    val description: String?,
    val icon: String?,
    val banner: String?,
    @SerialName("enable_downvotes")
    val enableDownvotes: Boolean,
    @SerialName("open_registration")
    val openRegistration: Boolean,
    @SerialName("enable_nsfw")
    val enableNsfw: Boolean,
    override val auth: String,
): RequireAuthentication
