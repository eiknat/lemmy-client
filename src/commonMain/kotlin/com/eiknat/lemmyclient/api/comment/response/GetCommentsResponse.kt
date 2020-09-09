package com.eiknat.lemmyclient.api.comment.response

import com.eiknat.lemmyclient.api.comment.model.Comment
import kotlinx.serialization.Serializable

@Serializable
data class GetCommentsResponse(val comments: List<Comment>)
