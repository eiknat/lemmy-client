package com.eiknat.lemmyclient.api.community.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AddModToCommunityForm(
    @SerialName("community_id")
    val communityId: Int,
    @SerialName("user_id")
    val userId: Int,
    val added: Boolean,
    override val auth: String,
): RequireAuthentication
