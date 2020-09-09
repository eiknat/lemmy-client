package com.eiknat.lemmyclient.api.community.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoveCommunityForm(
    @SerialName("edit_id")
    val communityId: Int,
    val removed: Boolean,
    val reason: String?,
    val expires: Int,
    override val auth: String,
): RequireAuthentication
