package com.eiknat.lemmyclient.api.user.response

import kotlinx.serialization.Serializable


// TODO find a better way to handle those without captcha enabled
@Serializable
data class GetCaptchaResponse(val ok: Ok? = Ok("no-captcha", null, "")) {
    @Serializable
    data class Ok(
        val png: String,
        val wav: String?,
        val uuid: String,
    )
}
