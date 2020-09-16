package com.eiknat.lemmyclient.client

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.handleError
import com.eiknat.lemmyclient.internal.Endpoint
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

internal object HttpAPI {
    private const val API_PATH = "/api/v1"
    lateinit var host: String
    lateinit var client: HttpClient

    suspend inline fun <reified T> get(
        endpoint: Endpoint,
        parameters: Map<String, String?> = emptyMap()
    ): APIResponse<T> {
        return send {
            client.get(endpoint.getUrl()) {
                this.buildParameters(parameters)
            }
        }
    }

    suspend inline fun <reified T> put(
        endpoint: Endpoint,
        body: Any
    ): T {
        return client.put(endpoint.getUrl()) {
            this.commonProperties()
            this.body = body
        }
    }

    suspend inline fun <reified T> post(
        endpoint: Endpoint,
        body: Any
    ): APIResponse<T> {
       return send {
            client.post(endpoint.getUrl()) {
                this.commonProperties()
                this.body = body
            }
        }
    }

    private inline fun <reified T> send(block: () -> T): APIResponse<T> {
        return try {
            APIResponse.Ok(block())
        } catch (t: Throwable) {
            handleError(t)
        }
    }

    private fun Endpoint.getUrl() = host + API_PATH + this.location

    private fun HttpRequestBuilder.buildParameters(map: Map<String, String?>) {
        map.forEach {
            if (!it.value.isNullOrEmpty()) {
                this.parameter(it.key, it.value)
            }
        }
    }

    private fun HttpRequestBuilder.commonProperties() {
        // TODO i added this for a reason but can't recall why, revalidate when adding a put/post test and remove if
        // not needed
//        this.host = this@HttpAPI.host
        this.contentType(ContentType.Application.Json)
    }
}
