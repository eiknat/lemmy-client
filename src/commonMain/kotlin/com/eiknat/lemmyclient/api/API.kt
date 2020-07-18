package com.eiknat.lemmyclient.api

import com.eiknat.lemmyclient.APIResult

expect open class API() {

	suspend fun <T> performRequest(op: RequestOp): APIResult<T>

    suspend fun performRequestAsync(op: RequestOp): APIResult<ResponseOp>

    @Suppress("UNCHECKED_CAST")
    fun <T> castResponse(response: ResponseOp): APIResult<T>

}
