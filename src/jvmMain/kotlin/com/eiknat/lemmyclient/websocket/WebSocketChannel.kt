package com.eiknat.lemmyclient.websocket

import com.eiknat.lemmyclient.APIResult
import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch

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
