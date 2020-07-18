package com.eiknat.lemmyclient

sealed class APIResult<out T> {
    class Success<out T>(val t: T): APIResult<T>()
    class Failure(val error: APIError): APIResult<Nothing>()
}

data class APIError(val errorEnum: ErrorEnum, val details: String = "")

enum class ErrorEnum {
    PARSE_ERROR,
    RESPONSE_ERROR,
    UNKNOWN
}
