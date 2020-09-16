package com.eiknat.lemmyclient.api.admin

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.admin.form.AddAdminForm
import com.eiknat.lemmyclient.api.admin.json.ADD_ADMIN_RESPONSE
import com.eiknat.lemmyclient.utils.MockClient
import com.eiknat.lemmyclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.asserter

class AdminTest {

    @Test
    fun `add admin`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "/admin/add",
                responseJson = ADD_ADMIN_RESPONSE,
            )

            val form = AddAdminForm(
                userId = 1200,
                add = true,
                auth = "testauth"
            )

            when (val res = Admin.addAdmin(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals(2, res.data.admins.size)
                }
            }
        }
    }
}
