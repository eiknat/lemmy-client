package com.eiknat.lemmyclient.api

import com.eiknat.lemmyclient.api.category.Category
import com.eiknat.lemmyclient.utils.MockClient
import com.eiknat.lemmyclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals

class CategoryTest {

    @Test
    fun `list categories`() {
        executeTest {
            MockClient(HttpMethod.Get, listJson, "/categories")
            val res = Category.list()
            assertEquals(4, res.categories.size, "response has four categories")
            val cat1 = res.categories.first { it.id == 1 }
            assertEquals("Discussion", cat1.name, "name deserializes correctly")
        }
    }

    private val listJson = """
        {"categories":[{"id":1,"name":"Discussion"},{"id":2,"name":"Humor/Memes"},{"id":3,"name":"Gaming"},{"id":4,"name":"Movies"}]}
    """.trimIndent()
}
