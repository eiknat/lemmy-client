package com.eiknat.lemmyclient.api.admin.response

import com.eiknat.lemmyclient.api.user.model.UserView
import kotlinx.serialization.Serializable

@Serializable
data class AddAdminResponse(val admins: List<UserView>)
