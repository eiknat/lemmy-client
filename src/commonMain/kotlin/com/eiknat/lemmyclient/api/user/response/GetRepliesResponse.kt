package com.eiknat.lemmyclient.api.user.response

import com.eiknat.lemmyclient.api.comment.model.Comment
import kotlinx.serialization.Serializable

@Serializable
data class GetRepliesResponse(val replies: List<Comment>)
