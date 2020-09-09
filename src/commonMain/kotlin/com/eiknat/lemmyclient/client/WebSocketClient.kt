package com.eiknat.lemmyclient.client

import com.eiknat.lemmyclient.internal.Data
import com.eiknat.lemmyclient.internal.Request
import com.eiknat.lemmyclient.internal.WebSocketOperation
import io.ktor.client.HttpClient
import io.ktor.client.features.websocket.*
import io.ktor.client.request.*
import io.ktor.http.cio.websocket.Frame
import io.ktor.http.cio.websocket.readText
import io.ktor.http.cio.websocket.send
import kotlinx.serialization.*
import kotlinx.serialization.json.Json


internal object WebSocketClient {
    private const val WEBSOCKET_PATH = "/api/v1/ws"

    lateinit var host: String
    lateinit var client: HttpClient
    lateinit var session: DefaultClientWebSocketSession

    @Serializable
    sealed class Response {
        @Serializable
        class Ok
        @Serializable
        data class Error(val error: String)
    }

    suspend fun session(host: String, client: HttpClient) {
        this.host = host
        this.client = client

        session = this.client.webSocketSession {
            this.host = host
        }

        receive()
    }

    internal suspend inline fun <reified T> send(op: WebSocketOperation, data: Data<T>) {
        val request = Json {
            prettyPrint = true
        }.encodeToString(Request(op.op, data))
        println(request)
        session.send(request)
    }

    internal suspend fun receive() {
        while (!session.incoming.isClosedForReceive) {
            when (val frame = session.incoming.receive()) {
                is Frame.Text -> { Json { ignoreUnknownKeys = true }.decodeFromString<Response>(frame.readText()) }
                else -> println("unsupported frame received: ${frame.frameType}")
            }
        }
    }
}
