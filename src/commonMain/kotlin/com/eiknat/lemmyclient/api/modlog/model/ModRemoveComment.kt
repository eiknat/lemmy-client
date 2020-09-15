package com.eiknat.lemmyclient.api.modlog.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModRemoveComment(
    val id: Int,
    @SerialName("mod_user_id")
    val modUserId: Int,
    @SerialName("comment_id")
    val commentId: Int,
    val reason: String?,
    val removed: Boolean = false,
    val when_: String,
    @SerialName("mod_user_name")
    val modUserName: String,
    @SerialName("comment_user_id")
    val commentUserId: Int,
    @SerialName("comment_user_name")
    val commentUserName: String,
    @SerialName("comment_content")
    val commentContent: String,
    @SerialName("post_id")
    val postId: Int,
    @SerialName("post_name")
    val postName: String,
    @SerialName("community_id")
    val communityId: Int,
    @SerialName("community_name")
    val communityName: String,
)
