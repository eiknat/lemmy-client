package com.eiknat.lemmyclient.api.site.response

import com.eiknat.lemmyclient.internal.AllowWebSocket
import com.eiknat.lemmyclient.internal.WebSocketOperation
import com.eiknat.lemmyclient.api.site.model.Site
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
data class SiteResponse(val site: Site)
