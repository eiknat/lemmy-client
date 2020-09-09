package com.eiknat.lemmyclient.api.community.response

import com.eiknat.lemmyclient.api.community.model.Community
import kotlinx.serialization.Serializable

@Serializable
data class CommunityResponse(val community: Community)
