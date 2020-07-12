package com.eiknat.lemmyclient.api

import com.eiknat.lemmyclient.api.comment.*
import com.eiknat.lemmyclient.api.community.*
import com.eiknat.lemmyclient.api.post.*
import com.eiknat.lemmyclient.api.user.*
import com.eiknat.lemmyclient.api.user.message.CreatePrivateMessage
import com.eiknat.lemmyclient.api.user.message.EditPrivateMessage
import com.eiknat.lemmyclient.api.user.message.GetPrivateMessages
import kotlinx.serialization.*
import kotlinx.serialization.modules.SerializersModule

@Polymorphic
@Serializable
abstract class Op

fun opSerializers() = SerializersModule {
    polymorphic(Op::class) {
        // comments
        CreateComment::class with CreateComment.serializer()
        CreateCommentLike::class with CreateCommentLike.serializer()
        EditComment::class with EditComment.serializer()
        GetComments::class with GetComments.serializer()
        SaveComment::class with SaveComment.serializer()

        // community
        AddModToCommunity::class with AddModToCommunity.serializer()
        BanFromCommunity::class with BanFromCommunity.serializer()
        CreateCommunity::class with CreateCommunity.serializer()
        EditCommunity::class with EditCommunity.serializer()
        FollowCommunity::class with FollowCommunity.serializer()
        GetCommunity::class with GetCommunity.serializer()
        GetFollowedCommunities::class with GetFollowedCommunities.serializer()
        ListCommunities::class with ListCommunities.serializer()
        TransferCommunity::class with TransferCommunity.serializer()

        // post
        CreatePost::class with CreatePost.serializer()
        CreatePostLike::class with CreatePostLike.serializer()
        EditPost::class with EditPost.serializer()
        GetPost::class with GetPost.serializer()
        SavePost::class with SavePost.serializer()

        // user
        CreatePrivateMessage::class with CreatePrivateMessage.serializer()
        EditPrivateMessage::class with EditPrivateMessage.serializer()
        GetPrivateMessages::class with GetPrivateMessages.serializer()
        AddAdmin::class with AddAdmin.serializer()
        BanUser::class with BanUser.serializer()
        DeleteAccount::class with DeleteAccount.serializer()
        EditUserMention::class with EditUserMention.serializer()
        GetReplies::class with GetReplies.serializer()
        GetUserDetails::class with GetUserDetails.serializer()
        GetUserMentions::class with GetUserMentions.serializer()
        Login::class with Login.serializer()
        MarkAllAsRead::class with MarkAllAsRead.serializer()
        PasswordChange::class with PasswordChange.serializer()
        PasswordReset::class with PasswordReset.serializer()
        Register::class with Register.serializer()
        SaveUserSettings::class with SaveUserSettings.serializer()
        UserJoin::class with UserJoin.serializer()
    }
}
