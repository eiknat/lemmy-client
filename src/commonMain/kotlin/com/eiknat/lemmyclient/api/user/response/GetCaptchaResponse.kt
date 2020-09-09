package com.eiknat.lemmyclient.api.user.response

import kotlinx.serialization.Serializable

@Serializable
data class GetCaptchaResponse(val ok: Ok) {
    @Serializable
    data class Ok(
        val png: String,
        val wav: String?,
        val uuid: String,
    )
}
