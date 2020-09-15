package com.eiknat.lemmyclient.api.privatemessage

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.privatemessage.form.GetPrivateMessagesForm
import com.eiknat.lemmyclient.api.privatemessage.json.GET_PRIVATE_MESSAGES_RESPONSE
import com.eiknat.lemmyclient.utils.MockClient
import com.eiknat.lemmyclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.asserter

internal class PrivateMessageTest {

    @Test
    fun `list private messages`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = GET_PRIVATE_MESSAGES_RESPONSE,
                endpoint = "/private_message/list",
                queryParams = "?unread_only=false&page=1&limit=2&auth=testauth"
            )

            val form = GetPrivateMessagesForm(
                unreadOnly = false,
                page = 1,
                limit = 2,
                auth = "testauth"
            )

            when (val res = PrivateMessage.list(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals(2, res.data.messages.size, "response has two messages")
                    val message = res.data.messages.first()
                    assertEquals(717, message.id, "deserialized message id correctly")
                    assertEquals("test", message.content, "deserialized content correctly")
                }
            }
        }
    }

}
