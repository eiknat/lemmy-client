package com.eiknat.lemmyclient.api

import com.eiknat.lemmyclient.api.comment.GetComments
import com.eiknat.lemmyclient.api.community.GetCommunity
import com.eiknat.lemmyclient.api.community.GetFollowedCommunities
import com.eiknat.lemmyclient.api.post.GetPost
import com.eiknat.lemmyclient.api.user.GetReplies
import com.eiknat.lemmyclient.api.user.GetUserDetails
import com.eiknat.lemmyclient.api.user.GetUserMentions
import kotlinx.serialization.*
import kotlinx.serialization.modules.SerializersModule

@Polymorphic
@Serializable
abstract class GetOp

fun getOpSerializers() = SerializersModule {
    polymorphic(GetOp::class) {
        GetComments::class with GetComments.serializer()
        GetCommunity::class with GetCommunity.serializer()
        GetFollowedCommunities::class with GetFollowedCommunities.serializer()
        GetPost::class with GetPost.serializer()
        GetReplies::class with GetReplies.serializer()
        GetUserDetails::class with GetUserDetails.serializer()
        GetUserMentions::class with GetUserMentions.serializer()
    }
}
