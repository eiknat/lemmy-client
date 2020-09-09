package com.eiknat.lemmyclient.api.user.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserView(
    val id: Int,
    @SerialName("actor_id")
    val actorId: String,
    val name: String,
    val avatar: String?,
    val email: String?,
    @SerialName("matrix_user_id")
    val matrixUserId: String?,
    val bio: String?,
    val local: Boolean,
    val admin: Boolean,
    val banned: Boolean,
    @SerialName("show_avatars")
    val showAvatars: Boolean,
    @SerialName("send_notifications_to_email")
    val sendNotificationsToEmail: Boolean,
    val published: String, // date
    @SerialName("number_of_posts")
    val numberOfPosts: Int,
    @SerialName("post_score")
    val postScore: Int,
    @SerialName("number_of_comments")
    val numberOfComments: Int,
    @SerialName("comment_score")
    val commentScore: Int,
)
