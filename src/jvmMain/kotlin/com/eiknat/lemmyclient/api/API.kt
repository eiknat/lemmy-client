package com.eiknat.lemmyclient.api

import com.eiknat.lemmyclient.APIError
import com.eiknat.lemmyclient.APIResult
import com.eiknat.lemmyclient.ErrorEnum
import com.eiknat.lemmyclient.websocket.WebSocketChannel
import io.ktor.util.KtorExperimentalAPI
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.consume
import kotlinx.serialization.ImplicitReflectionSerializer

@KtorExperimentalAPI
@ExperimentalCoroutinesApi
@ImplicitReflectionSerializer
actual abstract class API {

    private val job = SupervisorJob()
    private val scope = CoroutineScope(Dispatchers.IO + job)

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
