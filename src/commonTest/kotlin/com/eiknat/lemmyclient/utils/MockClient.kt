package com.eiknat.lemmyclient.utils

import com.eiknat.lemmyclient.client.HttpAPI
import io.ktor.client.*
import io.ktor.client.engine.mock.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.asserter

/**
 * Mock client to assist in testing
 *
 * @param httpMethod the method the request should be using
 * @param responseJson the stringified mock response json to return
 * @param endpoint the api endpoint under test
 */
internal class MockClient(
    private val httpMethod: HttpMethod,
    private val endpoint: String,
    private val queryParams: String = "",
    private val responseJson: String = "",
    private val httpStatusCode: HttpStatusCode = HttpStatusCode.OK
) {
    companion object {
        private const val TEST_HOST = "https://test.org"
    }

    private val client = HttpClient(MockEngine) {
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
        engine {
            addHandler { request ->
                validateRequest(request)
                when (request.url.fullUrl) {
                    "$TEST_HOST/api/v1$endpoint$queryParams" -> {
                        respond(
                            content = responseJson,
                            status = httpStatusCode,
                            headers = headersOf("Content-Type" to listOf("application/json")))
                    }
                    else -> asserter.fail("Unhandled ${request.url.fullUrl}")
                }
            }
        }
    }

    private fun validateRequest(request: HttpRequestData) {
        assertEquals("$TEST_HOST/api/v1$endpoint$queryParams", request.url.fullUrl)
        assertEquals(httpMethod, request.method, "HttpMethod is set correctly")
        if (httpMethod != HttpMethod.Get) {
            assertTrue(request.headers.contains("Accept", "application/json"), "Request contains application/json accept header")
            assertTrue(request.headers.contains("Accept-Charset", "UTF-8"), "Request contains UTF-8 accept-charset header")
        }
    }

    init {
        HttpAPI.client = this@MockClient.client
        HttpAPI.host = TEST_HOST
    }

    private val Url.fullUrl: String get() = "$TEST_HOST$fullPath"
}
