package com.eiknat.lemmyclient.api.site.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SiteConfigForm(
    @SerialName("config_hjson")
    val configHjson: String,
    override val auth: String,
): RequireAuthentication
