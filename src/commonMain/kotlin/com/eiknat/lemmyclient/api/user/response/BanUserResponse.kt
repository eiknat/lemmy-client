package com.eiknat.lemmyclient.api.user.response

import com.eiknat.lemmyclient.api.user.model.UserView
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BanUserResponse(
    val user: UserView,
    @SerialName("banned")
    val isBanned: Boolean
)
