package com.eiknat.lemmyclient.utils

internal expect fun <T> executeTest(code: suspend () -> T): T
