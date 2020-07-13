package com.eiknat.lemmyclient

import com.eiknat.lemmyclient.api.Op
import com.eiknat.lemmyclient.api.user.RegisterRequest
import com.eiknat.lemmyclient.api.user.UserApi
import com.eiknat.lemmyclient.api.user.UserJoinRequest
import com.eiknat.lemmyclient.websocket.WebSocketClient
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

    suspend fun sendRequest(request: Op) = coroutineScope {
//        launch { WebSocketClient.send(request) }
    }

//    fun getRequest(request: ResponseOp) = GlobalScope.async { WebSocketClient.send(request) }

    suspend fun sendRequesst(request: RegisterRequest) = coroutineScope {
        launch { UserApi.sendUserRequest(request) }
    }

//    suspend fun userJoin(userJoinRequest: UserJoinRequest) = coroutineScope {
//        WebSocketClient.send(userJoinRequest)
//    }

    suspend fun sendRequest(request: UserJoinRequest) = coroutineScope {
//        launch { WebSocketClient.send(request) }
    }
}
