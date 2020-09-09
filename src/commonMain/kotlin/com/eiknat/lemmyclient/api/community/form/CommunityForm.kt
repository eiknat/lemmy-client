package com.eiknat.lemmyclient.api.community.form

import com.eiknat.lemmyclient.api.auth.RequireAuthentication
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CommunityForm(
    @SerialName("edit_id")
    val communityId: Int,
    val name: String,
    val title: String,
    val description: String?,
    val icon: String?,
    val banner: String?,
    @SerialName("category_id")
    val categoryId: Int,
    val nsfw: Boolean,
    override val auth: String,
): RequireAuthentication
