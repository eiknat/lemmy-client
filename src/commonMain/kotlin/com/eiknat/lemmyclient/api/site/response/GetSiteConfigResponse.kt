package com.eiknat.lemmyclient.api.site.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetSiteConfigResponse(
    @SerialName("config_hjson")
    val configHjson: String,
)
