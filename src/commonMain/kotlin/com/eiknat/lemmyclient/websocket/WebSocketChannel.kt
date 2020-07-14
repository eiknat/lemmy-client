package com.eiknat.lemmyclient.websocket

import com.eiknat.lemmyclient.APIResult
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.coroutines.channels.Channel

expect class WebSocketChannel: Channel<APIResult<ResponseOp>>