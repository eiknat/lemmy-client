package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import com.eiknat.lemmyclient.api.responseOpSerializers
import com.eiknat.lemmyclient.websocket.WebSocketClient
import io.ktor.util.KtorExperimentalAPI
import kotlinx.coroutines.*
import kotlinx.serialization.ImplicitReflectionSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import kotlinx.serialization.parse

@KtorExperimentalAPI
@ImplicitReflectionSerializer
actual object UserApi {

    actual suspend fun performRequestAsync(op: RequestOp, handler: (String?) -> ResponseOp): Deferred<Unit> {
        return GlobalScope.async {
            WebSocketClient.send(op) { (handler::invoke)(it) }
        }
    }

    actual suspend fun sendUserRequest(request: RegisterRequest) {
        performRequestAsync(request) { handler(it!!) }.await()
    }

    private fun handler(string: String): ResponseOp {
        return Json(
            context = responseOpSerializers(),
            configuration = JsonConfiguration.Stable.copy(classDiscriminator = "op", ignoreUnknownKeys = true)
        ).parse(string)
    }
}
