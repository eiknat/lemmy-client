package com.eiknat.lemmyclient.api.privatemessage

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.privatemessage.form.*
import com.eiknat.lemmyclient.api.privatemessage.json.GET_PRIVATE_MESSAGES_RESPONSE
import com.eiknat.lemmyclient.api.privatemessage.json.PRIVATE_MESSAGE_RESPONSE
import com.eiknat.lemmyclient.utils.MockClient
import com.eiknat.lemmyclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
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

    @Test
    fun `create private message`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = PRIVATE_MESSAGE_RESPONSE,
                endpoint = "/private_message",
            )

            val form = PrivateMessageForm(
                content = "hello",
                recipientId = 1201,
                auth = "testauth"
            )

            when (val res = PrivateMessage.create(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("hello", res.data.message.content)
                }
            }
        }
    }

    @Test
    fun `edit private message`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Put,
                responseJson = PRIVATE_MESSAGE_RESPONSE,
                endpoint = "/private_message",
            )

            val form = EditPrivateMessageForm(
                messageId = 131,
                content = "hello",
                auth = "testauth"
            )

            when (val res = PrivateMessage.edit(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("hello", res.data.message.content)
                }
            }
        }
    }

    @Test
    fun `delete private message`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = PRIVATE_MESSAGE_RESPONSE,
                endpoint = "/private_message/delete",
            )

            val form = DeletePrivateMessageForm(
                messageId = 131,
                deleted = true,
                auth = "testauth"
            )

            when (val res = PrivateMessage.delete(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertTrue(res.data.message.deleted)
                }
            }
        }
    }

    @Test
    fun `mark private message as read`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = PRIVATE_MESSAGE_RESPONSE,
                endpoint = "/private_message/mark_as_read",
            )

            val form = MarkPrivateMessageAsReadForm(
                messageId = 131,
                read = true,
                auth = "testauth"
            )

            when (val res = PrivateMessage.markAsRead(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("hello", res.data.message.content)
                }
            }
        }
    }
}
