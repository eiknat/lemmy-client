package com.eiknat.lemmyclient.api.user.response

import com.eiknat.lemmyclient.api.comment.model.Comment
import com.eiknat.lemmyclient.api.community.model.CommunityUser
import com.eiknat.lemmyclient.api.post.model.Post
import com.eiknat.lemmyclient.api.user.model.UserView
import kotlinx.serialization.Serializable

@Serializable
data class UserDetailsResponse(
    val user: UserView,
    val follows: List<CommunityUser>,
    val moderates: List<CommunityUser>,
    val comments: List<Comment>,
    val posts: List<Post>,
    val admins: List<UserView>
)
