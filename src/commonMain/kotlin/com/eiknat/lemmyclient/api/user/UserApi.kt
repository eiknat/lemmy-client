package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.APIResult

import com.eiknat.lemmyclient.apipublic.user.RegisterRequest
import com.eiknat.lemmyclient.apipublic.user.RegisterResponse

object UserAPI {
    suspend fun register(request: RegisterRequest): APIResult<RegisterResponse> {
        return Register.send(request)
    }
}
