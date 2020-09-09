package com.eiknat.lemmyclient

import com.eiknat.lemmyclient.client.HttpAPI
import com.eiknat.lemmyclient.client.WebSocketClient
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.websocket.*
import kotlinx.serialization.json.Json

class LemmyAPI(
    val baseUrl: String,
    val enableWebSockets: Boolean = false
) {
    private val jsonConfig = Json { ignoreUnknownKeys = true }

    internal val client by lazy {
        HttpClient {
            install(JsonFeature) {
                serializer = KotlinxSerializer(jsonConfig)
            }
            if (enableWebSockets) install(WebSockets)
        }
    }

    init {
        HttpAPI.apply {
            this.host = baseUrl
            this.client = this@LemmyAPI.client
        }
        if (enableWebSockets) {
            WebSocketClient.apply {
                this.host = baseUrl
                this.client = this@LemmyAPI.client
            }
        }
    }
}
