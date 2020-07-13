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
abstract class ResponseOp

fun responseOpSerializers() = SerializersModule {
    polymorphic(ResponseOp::class) {

        // comment
        CreateCommentResponse::class with CreateCommentResponse.serializer()
        CreateCommentLikeResponse::class with CreateCommentLikeResponse.serializer()
        EditCommentResponse::class with EditCommentResponse.serializer()
        GetCommentsResponse::class with GetCommentsResponse.serializer()
        SaveCommentResponse::class with SaveCommentResponse.serializer()

        // community
        AddModToCommunityResponse::class with AddModToCommunityResponse.serializer()
        BanFromCommunityResponse::class with BanFromCommunityResponse.serializer()
        CreateCommunityResponse::class with CreateCommunityResponse.serializer()
        EditCommunityResponse::class with EditCommunityResponse.serializer()
        FollowCommunityResponse::class with FollowCommunityResponse.serializer()
        GetCommunityResponse::class with GetCommunityResponse.serializer()
        GetFollowedCommunitiesResponse::class with GetFollowedCommunitiesResponse.serializer()
        ListCommunitiesResponse::class with ListCommunitiesResponse.serializer()
        TransferCommunityResponse::class with TransferCommunityResponse.serializer()
        
        // post
        CreatePostResponse::class with CreatePostResponse.serializer()
        CreatePostLikeResponse::class with CreatePostLikeResponse.serializer()
        EditPostResponse::class with EditPostResponse.serializer()
        GetPostResponse::class with GetPostResponse.serializer()
        SavePostResponse::class with SavePostResponse.serializer()
        
        // user
        AddAdminResponse::class with AddAdminResponse.serializer()
        BanUserResponse::class with BanUserResponse.serializer()
        DeleteAccountResponse::class with DeleteAccountResponse.serializer()
        EditUserMentionResponse::class with EditUserMentionResponse.serializer()
        GetRepliesResponse::class with GetRepliesResponse.serializer()
        GetUserDetailsResponse::class with GetUserDetailsResponse.serializer()
        GetUserMentionsResponse::class with GetUserMentionsResponse.serializer()
        LoginResponse::class with LoginResponse.serializer()
        MarkAllAsReadResponse::class with MarkAllAsReadResponse.serializer()
        PasswordChangeResponse::class with PasswordChangeResponse.serializer()
        PasswordResetResponse::class with PasswordResetResponse.serializer()
        RegisterResponse::class with RegisterResponse.serializer()
        SaveUserSettingsResponse::class with SaveUserSettingsResponse.serializer()
        UserJoinResponse::class with UserJoinResponse.serializer()
    }
}
