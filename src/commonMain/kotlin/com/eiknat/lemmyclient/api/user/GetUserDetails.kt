package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("GetUserDetails")
class GetUserDetailsRequest(val data: Data): RequestOp() {

    @Serializable
    data class Data(
        val user_id: Int?,
        val username: String?,
        val sort: String,
        val page: Int?,
        val limit: Int?,
        val community_id: Int?,
        val saved_only: Boolean,
        val auth: String
    )
}

@Serializable
@SerialName("GetUserDetails")
class GetUserDetailsResponse(val data: Data): ResponseOp() {

    @Serializable
    data class Data(
        val user: String, // UserView
        val follows: String, // CommunityFollowerView
        val moderates: String, // CommunityModeratorView
        val comments: String, // CommentView
        val posts: String, // PostView
        val admins: String // UserView
    )
}
