package com.eiknat.lemmyclient

import com.eiknat.lemmyclient.api.internal.user.UserJoinRequest
import com.eiknat.lemmyclient.websocket.WebSocketClient
import io.ktor.util.KtorExperimentalAPI
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.coroutineScope
import kotlinx.serialization.ImplicitReflectionSerializer

@ExperimentalCoroutinesApi
@ImplicitReflectionSerializer
@KtorExperimentalAPI
class LemmyAPI(host: String) {

    init {
        WebSocketClient.host = host
    }

    // most of this won't stick around, pretty much just for easy testing
    suspend fun sendRequest(request: UserJoinRequest) = coroutineScope {
//        launch { UserAPI.sendUserJoin(request) }
    }
}
