package com.eiknat.lemmyclient

import com.eiknat.lemmyclient.api.post.GetPost
import com.eiknat.lemmyclient.websocket.WebSocketClient
import io.ktor.client.HttpClient
import io.ktor.client.features.websocket.WebSockets
import io.ktor.util.KtorExperimentalAPI
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.serialization.ImplicitReflectionSerializer

@ImplicitReflectionSerializer
@KtorExperimentalAPI
class LemmyAPI(host: String) {

    init {
        WebSocketClient.host = host
    }

    private val client = HttpClient() { install(WebSockets) }

    suspend fun sendRequest(request: GetPost) = coroutineScope {
        launch {
            WebSocketClient.get(request)
        }
    }
}
