package com.eiknat.lemmyclient.websocket

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import com.eiknat.lemmyclient.api.requestOpSerializers
import com.eiknat.lemmyclient.api.user.UserJoinResponse
import io.ktor.client.HttpClient
import io.ktor.client.features.websocket.WebSockets
import io.ktor.client.features.websocket.ws
import io.ktor.http.cio.websocket.Frame
import io.ktor.http.cio.websocket.readText
import io.ktor.http.cio.websocket.send
import io.ktor.util.KtorExperimentalAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
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

    internal suspend fun send(request: RequestOp, handler: (String?) -> ResponseOp) {
        withContext(Dispatchers.Default) {
            client.ws(
                host = host,
                path = WEBSOCKET_PATH
            ) {
                val json = Json(
                    context = requestOpSerializers(),
                    configuration = JsonConfiguration.Stable.copy(classDiscriminator = "op")
                ).stringify(request)
                println(json)
                this.send(json)
                val result = when (val frame = incoming.receive()) {
                    is Frame.Text -> {
                        println(frame.readText()); frame.readText()
                    }
                    else -> null
                }
                (handler::invoke)(result)
            }
        }
    }

//    suspend fun send(request: RequestOp) = client.ws(
//        host = host,
//        path = WEBSOCKET_PATH
//    ) {
//        val json = Json(
//            configuration = JsonConfiguration.Stable.copy(classDiscriminator = "op")
//        ).stringify(request)
//        println(json)
//        this.send(json)
//        when (val frame = incoming.receive()) {
//            is Frame.Text -> {
//                val response = frame.readText()
//                println(response);
//                handleMessage(response)
//            }
//            is Frame.Binary -> println(frame.readBytes())
//        }
//    }
//
//    suspend fun send(request: RequestOp) = client.ws(
//        host = host,
//        path = WEBSOCKET_PATH
//    ) {
//        val json = Json(configuration = JsonConfiguration.Stable).stringify(request)
//        println(json)
//        this.send(json)
//        when (val frame = incoming.receive()) {
//            is Frame.Text -> {
//                val response = frame.readText()
//                println(response);
//                handleMessagze(response)
//            }
//            is Frame.Binary -> println(frame.readBytes())
//        }
//    }

            suspend fun handleMessagze(string: String): UserJoinResponse {
                println("response :: $string")
                val json = Json(configuration = JsonConfiguration.Stable.copy(classDiscriminator = "op", ignoreUnknownKeys = true))
                    .parse(UserJoinResponse.serializer(), string)
                println(json)
                return json
            }

            suspend fun handleMessage(string: String): ResponseOp {
                println("response :: $string")
                val json = Json(configuration = JsonConfiguration.Stable.copy(classDiscriminator = "op", ignoreUnknownKeys = true))
                    .parse(ResponseOp.serializer(), string)
                println(json)
                return json
            }
}


