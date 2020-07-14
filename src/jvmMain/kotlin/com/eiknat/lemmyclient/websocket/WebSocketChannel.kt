package com.eiknat.lemmyclient.websocket

import com.eiknat.lemmyclient.APIResult
import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import io.ktor.util.KtorExperimentalAPI
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.serialization.ImplicitReflectionSerializer

@KtorExperimentalAPI
@ExperimentalCoroutinesApi
@ImplicitReflectionSerializer
actual class WebSocketChannel(
    op: RequestOp,
    scope: CoroutineScope,
    private val channel: Channel<APIResult<ResponseOp>> = Channel()
): Channel<APIResult<ResponseOp>> by channel {

    init {
        scope.launch(Dispatchers.IO) {
            while (!channel.isClosedForSend) {
                WebSocketClient.send(op, channel)
            }
        }
    }
}
