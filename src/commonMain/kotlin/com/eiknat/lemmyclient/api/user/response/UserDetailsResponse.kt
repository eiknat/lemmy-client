package com.eiknat.lemmyclient.api.user.response

import com.eiknat.lemmyclient.api.comment.model.Comment
import com.eiknat.lemmyclient.api.community.model.CommunityUser
import com.eiknat.lemmyclient.api.post.model.Post
import com.eiknat.lemmyclient.api.user.model.UserView
import kotlinx.serialization.Serializable

@Serializable
data class UserDetailsResponse(
    val user: UserView,
    val follows: List<CommunityUser> = emptyList(),
    val moderates: List<CommunityUser> = emptyList(),
    val comments: List<Comment> = emptyList(),
    val posts: List<Post> = emptyList(),
    val admins: List<UserView> = emptyList()
)
