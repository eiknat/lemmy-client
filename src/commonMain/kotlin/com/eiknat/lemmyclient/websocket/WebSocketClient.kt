package com.eiknat.lemmyclient.websocket

import com.eiknat.lemmyclient.APIError
import com.eiknat.lemmyclient.APIResult
import com.eiknat.lemmyclient.ErrorEnum
import com.eiknat.lemmyclient.api.internal.RequestOp
import com.eiknat.lemmyclient.api.internal.ResponseOp
import com.eiknat.lemmyclient.api.internal.requestOpSerializers
import com.eiknat.lemmyclient.api.internal.responseOpSerializers
import io.ktor.client.HttpClient
import io.ktor.client.features.websocket.WebSockets
import io.ktor.client.features.websocket.ws
import io.ktor.http.cio.websocket.Frame
import io.ktor.http.cio.websocket.readText
import io.ktor.http.cio.websocket.send
import kotlinx.coroutines.channels.Channel
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import kotlinx.serialization.stringify


object WebSocketClient {
    private const val WEBSOCKET_PATH = "/api/v1/ws"
    private val client = HttpClient { install(WebSockets) }

    // TODO check if this is set, and not empty
    lateinit var host: String

    internal suspend fun send(request: RequestOp, channel: Channel<APIResult<ResponseOp>>) {
        client.ws(
            host = host,
            port = 8536,
            path = WEBSOCKET_PATH
        ) {
            val json = Json(
                context = requestOpSerializers(),
                configuration = JsonConfiguration.Stable.copy(classDiscriminator = "op")
            ).stringify(request)
            println(json)
            this.send(json)
            when (val frame = incoming.receive()) {
                is Frame.Text -> {
                    println(frame.readText())
                    channel.send(handleResult(frame.readText()))
                }
                else -> println("unsupported frame received: ${frame.frameType}")
            }
        }
    }

    private fun handleResult(result: String): APIResult<ResponseOp> {
        return try {
            APIResult.Success(result.parseResponse())
        } catch (e: Exception) {
            APIResult.Failure(APIError(ErrorEnum.PARSE_ERROR, result))
        }
    }

    private fun String.parseResponse() = Json(
        context = responseOpSerializers(),
        configuration = JsonConfiguration.Stable.copy(classDiscriminator = "op")
    ).parse(ResponseOp.serializer(), this)
}
