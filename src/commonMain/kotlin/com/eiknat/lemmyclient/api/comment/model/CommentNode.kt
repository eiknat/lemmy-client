package com.eiknat.lemmyclient.api.comment.model

import kotlinx.serialization.Serializable

@Serializable
data class CommentNode(
    val comment: Comment,
    val children: List<CommentNode>?
)
