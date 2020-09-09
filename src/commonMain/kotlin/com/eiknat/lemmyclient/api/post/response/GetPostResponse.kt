package com.eiknat.lemmyclient.api.post.response

import com.eiknat.lemmyclient.api.comment.model.Comment
import com.eiknat.lemmyclient.api.community.model.Community
import com.eiknat.lemmyclient.api.community.model.CommunityUser
import com.eiknat.lemmyclient.api.post.model.Post
import kotlinx.serialization.Serializable

@Serializable
data class GetPostResponse(
    val post: Post,
    val comments: List<Comment>,
    val community: Community,
    val moderators: List<CommunityUser>,
    val online: Int,
)
