package com.eiknat.lemmyclient.api.internal

import com.eiknat.lemmyclient.APIError
import com.eiknat.lemmyclient.APIResult
import com.eiknat.lemmyclient.ErrorEnum
import com.eiknat.lemmyclient.websocket.WebSocketChannel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.consume
import kotlinx.coroutines.withContext

actual open class API {

    private val job = SupervisorJob()
    private val scope = CoroutineScope(Dispatchers.IO + job)

    actual suspend fun <T> performRequest(op: RequestOp): APIResult<T> {
        return withContext(scope.coroutineContext) {
            // TODO eh figure out something better here.
            WebSocketChannel(op, this).consume { this.receive() }
        } as APIResult<T>
    }


    actual suspend fun performRequestAsync(op: RequestOp): APIResult<ResponseOp> {
        return withContext(scope.coroutineContext) {
            WebSocketChannel(op, this).consume { this.receive() }
        }
    }

    @Suppress("UNCHECKED_CAST")
    actual fun <T> castResponse(response: ResponseOp): APIResult<T> {
        return try {
            APIResult.Success(response as T)
        } catch (e: ClassCastException) {
            APIResult.Failure(APIError(ErrorEnum.RESPONSE_ERROR, "Response succeeded, but was of unexpected type."))
        }
    }
}
