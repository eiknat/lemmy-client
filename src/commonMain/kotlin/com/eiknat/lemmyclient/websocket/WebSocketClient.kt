package com.eiknat.lemmyclient.websocket

import com.eiknat.lemmyclient.api.Op
import com.eiknat.lemmyclient.api.opSerializers
import io.ktor.client.HttpClient
import io.ktor.client.features.websocket.WebSockets
import io.ktor.client.features.websocket.ws
import io.ktor.http.cio.websocket.Frame
import io.ktor.http.cio.websocket.readBytes
import io.ktor.http.cio.websocket.readText
import io.ktor.http.cio.websocket.send
import io.ktor.util.KtorExperimentalAPI
import kotlinx.serialization.ImplicitReflectionSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import kotlinx.serialization.stringify

@KtorExperimentalAPI
@ImplicitReflectionSerializer
object WebSocketClient {
    private const val WEBSOCKET_PATH = "/api/v1/ws"
    private val client = HttpClient() { install(WebSockets) }

    lateinit var host: String

    internal suspend fun send(request: Op) = client.ws(
        host = host,
        path = WEBSOCKET_PATH
    ) {
        val json = Json(
            context = opSerializers(),
            configuration = JsonConfiguration.Stable.copy(classDiscriminator = "op")
        ).stringify(request)
        println(json)
        this.send(json)
        when (val frame = incoming.receive()) {
            is Frame.Text -> println(frame.readText())
            is Frame.Binary -> println(frame.readBytes())
        }
    }
}


