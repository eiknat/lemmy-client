package com.eiknat.lemmyclient.utils

import kotlinx.coroutines.runBlocking

internal actual fun <T> executeTest(code: suspend () -> T): T {
    return runBlocking { code() }
}
