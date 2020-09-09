package com.eiknat.lemmyclient.api.site.response

import com.eiknat.lemmyclient.api.site.model.Site
import kotlinx.serialization.Serializable

@Serializable
data class SiteResponse(val site: Site)
