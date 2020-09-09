package com.eiknat.lemmyclient.api.community.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DeleteCommunityForm(
    @SerialName("edit_id")
    val communityId: Int,
    val deleted: Boolean,
    override val auth: String,
): RequireAuthentication
