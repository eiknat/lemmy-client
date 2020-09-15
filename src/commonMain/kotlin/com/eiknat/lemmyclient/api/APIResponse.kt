package com.eiknat.lemmyclient.api

import io.ktor.client.features.*

sealed class APIResponse<out T> {
    data class Ok<T>(val data: T): APIResponse<T>()
    data class Error(
        val statusCode: Int,
        val message: String,
    ): APIResponse<Nothing>()
}

internal fun <T> handleError(t: Throwable): APIResponse<T> {
    return when (t) {
        is ResponseException -> {
            APIResponse.Error(
                statusCode = t.response?.status?.value ?: 0,
                message = t.response?.status?.description ?: "unknown error occurred",
            )
        } else -> throw t
    }
}
