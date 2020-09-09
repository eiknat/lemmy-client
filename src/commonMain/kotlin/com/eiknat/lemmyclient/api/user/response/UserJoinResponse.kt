package com.eiknat.lemmyclient.api.user.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserJoinResponse(@SerialName("user_id") val userId: Int)
