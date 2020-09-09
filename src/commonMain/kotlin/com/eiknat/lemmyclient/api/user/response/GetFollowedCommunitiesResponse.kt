package com.eiknat.lemmyclient.api.user.response

import com.eiknat.lemmyclient.api.community.model.Community
import kotlinx.serialization.Serializable

@Serializable
data class GetFollowedCommunitiesResponse(val communities: List<Community>)
