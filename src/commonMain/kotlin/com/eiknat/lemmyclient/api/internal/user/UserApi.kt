package com.eiknat.lemmyclient.api.internal.user

import com.eiknat.lemmyclient.APIResult

import com.eiknat.lemmyclient.api.RegisterRequest
import com.eiknat.lemmyclient.api.RegisterResponse

object UserAPI {
    suspend fun register(request: RegisterRequest): APIResult<RegisterResponse> {
        return Register.send(request)
    }
}
