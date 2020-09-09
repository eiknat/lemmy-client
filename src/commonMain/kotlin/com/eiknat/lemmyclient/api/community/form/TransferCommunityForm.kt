package com.eiknat.lemmyclient.api.community.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TransferCommunityForm(
    @SerialName("community_id")
    val communityId: Int,
    @SerialName("user_id")
    val transferUserId: Int,
    override val auth: String,
): RequireAuthentication
