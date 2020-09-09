package com.eiknat.lemmyclient.api.community.response

import com.eiknat.lemmyclient.api.community.model.Community
import com.eiknat.lemmyclient.api.community.model.CommunityUser
import kotlinx.serialization.Serializable

@Serializable
data class GetCommunityResponse(
    val community: Community,
    val moderators: List<CommunityUser>,
    val online: Int
)
