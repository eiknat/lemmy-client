package com.eiknat.lemmyclient.api.post.response

import com.eiknat.lemmyclient.api.post.model.Post
import kotlinx.serialization.Serializable

@Serializable
data class GetPostsResponse(val posts: List<Post>)
