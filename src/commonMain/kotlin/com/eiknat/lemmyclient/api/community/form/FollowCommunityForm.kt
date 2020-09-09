package com.eiknat.lemmyclient.api.community.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FollowCommunityForm(
    @SerialName("community_id")
    val communityId: Int,
    val follow: Boolean,
    override val auth: String
): RequireAuthentication
