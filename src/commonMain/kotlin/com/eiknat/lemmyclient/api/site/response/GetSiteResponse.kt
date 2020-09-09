package com.eiknat.lemmyclient.api.site.response

import com.eiknat.lemmyclient.api.site.model.Site
import com.eiknat.lemmyclient.api.user.User
import com.eiknat.lemmyclient.api.user.model.UserView
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetSiteResponse(
    val site: Site,
    val admins: List<UserView>,
    val banned: List<UserView>,
    val online: Int,
    val version: String,
    @SerialName("my_user")
    @Contextual
    val myUser: User?,
    @SerialName("federated_instances")
    val federatedInstances: List<String>?,
)
