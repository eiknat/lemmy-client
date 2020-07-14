package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.APIResult
import com.eiknat.lemmyclient.api.API
import io.ktor.util.KtorExperimentalAPI
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.serialization.ImplicitReflectionSerializer

@ExperimentalCoroutinesApi
@KtorExperimentalAPI
@ImplicitReflectionSerializer
actual object UserAPI: API() {

    actual suspend fun sendUserJoin(request: UserJoinRequest): APIResult<UserJoinResponse> {
        return when (val response = performRequestAsync(request)) {
            is APIResult.Success -> { castResponse<UserJoinResponse>(response.data) }
            is APIResult.Failure -> { APIResult.Failure(response.error) }
        }
    }
}
