package com.eiknat.lemmyclient.api.community.response

import com.eiknat.lemmyclient.api.community.model.CommunityUser
import kotlinx.serialization.Serializable

@Serializable
data class AddModToCommunityResponse(
    val moderators: List<CommunityUser>
)
