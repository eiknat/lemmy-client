package com.eiknat.lemmyclient

import com.eiknat.lemmyclient.api.Op
import com.eiknat.lemmyclient.websocket.WebSocketClient
import io.ktor.util.KtorExperimentalAPI
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.serialization.ImplicitReflectionSerializer

@ImplicitReflectionSerializer
@KtorExperimentalAPI
class LemmyAPI(host: String) {

    init { WebSocketClient.host = host }

    suspend fun sendRequest(request: Op) = coroutineScope {
        launch { WebSocketClient.send(request) }
    }
}
