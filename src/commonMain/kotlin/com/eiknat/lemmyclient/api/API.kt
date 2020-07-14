package com.eiknat.lemmyclient.api

import com.eiknat.lemmyclient.APIResult

expect abstract class API {

    suspend fun performRequestAsync(op: RequestOp): APIResult<ResponseOp>

    fun <T> castResponse(response: ResponseOp): APIResult<T>
}
