package com.eiknat.lemmyclient.api.community.form

import com.eiknat.lemmyclient.api.auth.OptionalAuthentication

data class GetCommunityForm(
    val id: Int?,
    val name: String?,
    override val auth: String?
): OptionalAuthentication


internal fun GetCommunityForm.asParams() = mapOf(
    Pair("id", id.toString()),
    Pair("name", name),
    Pair("auth", auth)
)
