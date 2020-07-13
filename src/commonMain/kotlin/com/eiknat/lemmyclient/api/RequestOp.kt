package com.eiknat.lemmyclient.api

import com.eiknat.lemmyclient.api.comment.*
import com.eiknat.lemmyclient.api.community.*
import com.eiknat.lemmyclient.api.post.*
import com.eiknat.lemmyclient.api.user.*
import kotlinx.serialization.Polymorphic
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.SerializersModule

@Polymorphic
@Serializable
abstract class RequestOp

fun requestOpSerializers() = SerializersModule {
    polymorphic(RequestOp::class) {

        // comment
        CreateCommentRequest::class with CreateCommentRequest.serializer()
        CreateCommentLikeRequest::class with CreateCommentLikeRequest.serializer()
        EditCommentRequest::class with EditCommentRequest.serializer()
        GetCommentsRequest::class with GetCommentsRequest.serializer()
        SaveCommentRequest::class with SaveCommentRequest.serializer()

        // community
        AddModToCommunityRequest::class with AddModToCommunityRequest.serializer()
        BanFromCommunityRequest::class with BanFromCommunityRequest.serializer()
        CreateCommunityRequest::class with CreateCommunityRequest.serializer()
        EditCommunityRequest::class with EditCommunityRequest.serializer()
        FollowCommunityRequest::class with FollowCommunityRequest.serializer()
        GetCommunityRequest::class with GetCommunityRequest.serializer()
        GetFollowedCommunitiesRequest::class with GetFollowedCommunitiesRequest.serializer()
        ListCommunitiesRequest::class with ListCommunitiesRequest.serializer()
        TransferCommunityRequest::class with TransferCommunityRequest.serializer()

        // post
        CreatePostRequest::class with CreatePostRequest.serializer()
        CreatePostLikeRequest::class with CreatePostLikeRequest.serializer()
        EditPostRequest::class with EditPostRequest.serializer()
        GetPostRequest::class with GetPostRequest.serializer()
        SavePostRequest::class with SavePostRequest.serializer()

        // user
        AddAdminRequest::class with AddAdminRequest.serializer()
        BanUserRequest::class with BanUserRequest.serializer()
        DeleteAccountRequest::class with DeleteAccountRequest.serializer()
        EditUserMentionRequest::class with EditUserMentionRequest.serializer()
        GetRepliesRequest::class with GetRepliesRequest.serializer()
        GetUserDetailsRequest::class with GetUserDetailsRequest.serializer()
        GetUserMentionsRequest::class with GetUserMentionsRequest.serializer()
        LoginRequest::class with LoginRequest.serializer()
        MarkAllAsReadRequest::class with MarkAllAsReadRequest.serializer()
        PasswordChangeRequest::class with PasswordChangeRequest.serializer()
        PasswordResetRequest::class with PasswordResetRequest.serializer()
        RegisterRequest::class with RegisterRequest.serializer()
        SaveUserSettingsRequest::class with SaveUserSettingsRequest.serializer()
        UserJoinRequest::class with UserJoinRequest.serializer()
    }
}
