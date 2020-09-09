package com.eiknat.lemmyclient.client


import com.eiknat.lemmyclient.internal.Endpoint
import io.ktor.client.HttpClient
import io.ktor.client.request.*
import io.ktor.client.request.get
import io.ktor.http.*

internal object HttpAPI {
    private const val API_PATH = "/api/v1"
    lateinit var host: String
    lateinit var client: HttpClient

    suspend inline fun <reified T> get(
        endpoint: Endpoint,
        parameters: Map<String, String?>
    ): T {
        return client.get(endpoint.getUrl()) {
            this.commonProperties()
            this.buildParameters(parameters)
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
    ): T {
        return client.post(endpoint.getUrl()) {
            this.commonProperties()
            this.body = body
        }
    }

    private fun HttpRequestBuilder.buildParameters(map: Map<String, String?>) {
        map.forEach {
            if (!it.value.isNullOrEmpty()) {
                this.parameter(it.key, it.value)
            }
        }
    }

    fun Endpoint.getUrl() = API_PATH + this.location

    private fun HttpRequestBuilder.commonProperties() {
        this.host = this@HttpAPI.host
        this.contentType(ContentType.Application.Json)
    }
}
