package com.eiknat.lemmyclient.api.community.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BanFromCommunityForm(
    @SerialName("community_id")
    val communityId: Int,
    @SerialName("user_id")
    val userId: Int,
    val ban: Boolean,
    @SerialName("remove_data")
    val shouldRemoveData: Boolean,
    val reason: String?,
    val expires: Int?,
    override val auth: String,
): RequireAuthentication
