package com.eiknat.lemmyclient.api.community.response

import com.eiknat.lemmyclient.api.user.model.UserView
import kotlinx.serialization.Serializable

@Serializable
data class BanFromCommunityResponse(
    val user: UserView,
    val banned: Boolean
)
