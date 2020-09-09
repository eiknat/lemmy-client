package com.eiknat.lemmyclient.api.site.response

import com.eiknat.lemmyclient.internal.AllowWebSocket
import com.eiknat.lemmyclient.internal.WebSocketOperation
import com.eiknat.lemmyclient.api.interfaces.user.User
import com.eiknat.lemmyclient.api.interfaces.user.UserView
import com.eiknat.lemmyclient.api.site.model.Site
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
data class GetSiteResponse(
    val site: Site,
    val admins: List<UserView>,
    val banned: List<UserView>,
    val online: Int,
    val version: String,
    @SerialName("my_user")
    val myUser: User?,
    @SerialName("federated_instances")
    val federatedInstances: List<String>?,
)
