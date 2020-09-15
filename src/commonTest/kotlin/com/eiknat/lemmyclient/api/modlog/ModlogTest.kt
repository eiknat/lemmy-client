package com.eiknat.lemmyclient.api.modlog

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.modlog.form.ModlogForm
import com.eiknat.lemmyclient.api.modlog.json.MODLOG_RESPONSE
import com.eiknat.lemmyclient.utils.MockClient
import com.eiknat.lemmyclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.asserter

internal class ModlogTest {

    @Test
    fun `get modlog`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = MODLOG_RESPONSE,
                endpoint = "/modlog",
                queryParams = "?limit=2"
            )

            val form = ModlogForm(
                modUserId = null,
                communityId = null,
                page = null,
                limit = 2
            )

            when (val res = Modlog.get(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val modlog = res.data
                    assertEquals(2, modlog.added.size, "added size is 2")
                    assertEquals(2, modlog.addedToCommunity.size, "addedToCommunity size is 2")
                    assertEquals(2, modlog.banned.size, "banned size is 2")
                }
            }
        }
    }

}
