package com.eiknat.lemmyclient.api.user.response

import com.eiknat.lemmyclient.api.user.model.UserMentionView
import kotlinx.serialization.Serializable

@Serializable
data class UserMentionsResponse(val mentions: List<UserMentionView>)
