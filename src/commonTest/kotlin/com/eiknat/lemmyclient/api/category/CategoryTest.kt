package com.eiknat.lemmyclient.api.category

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.category.json.LIST_CATEGORIES_RESPONSE
import com.eiknat.lemmyclient.utils.MockClient
import com.eiknat.lemmyclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.asserter

internal class CategoryTest {

    @Test
    fun `list categories`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                endpoint = "/categories",
                responseJson = LIST_CATEGORIES_RESPONSE,
            )
            when (val res = Category.list()) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals(4, res.data.categories.size, "response has four categories")
                    val cat1 = res.data.categories.first { it.id == 1 }
                    assertEquals("Discussion", cat1.name, "name deserializes correctly")
                }
            }
        }
    }

    @Test // TODO this should go in a different test file
    fun `handle error test`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                endpoint = "/categories",
                httpStatusCode = HttpStatusCode.InternalServerError
            )
            when (val res = Category.list()) {
                is APIResponse.Error -> {
                    assertEquals(500, res.statusCode)
                }
                is APIResponse.Ok -> { asserter.fail("should not have passed") }
            }
        }
    }
}
