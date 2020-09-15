package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.SortType
import com.eiknat.lemmyclient.api.auth.Auth
import com.eiknat.lemmyclient.api.user.form.GetRepliesForm
import com.eiknat.lemmyclient.api.user.form.UserDetailsForm
import com.eiknat.lemmyclient.api.user.form.UserMentionsForm
import com.eiknat.lemmyclient.api.user.json.*
import com.eiknat.lemmyclient.utils.MockClient
import com.eiknat.lemmyclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.asserter

internal class UserTest {


    @Test
    fun `get captcha`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = CAPTCHA_RESPONSE,
                endpoint = "/user/get_captcha",
            )

            when (val res = User.getCaptcha()) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val ok = res.data.ok
                    assertEquals("big/long/string", ok!!.png)
                    assertNull(ok.wav)
                    assertEquals("bc0beea9-d8dd-4be6-be0c-375526b447be", ok.uuid)
                }
            }
        }
    }

    @Test
    fun `get user details`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = USER_DETAILS_RESPONSE,
                endpoint = "/user",
                queryParams = "?username=testuser&sort=Active&limit=2&saved_only=false"
            )

            val form = UserDetailsForm(
                userId = null,
                username = "testuser",
                sort = SortType.ACTIVE,
                page = null,
                limit = 2,
                communityId = null,
                savedOnly = false,
                auth = null
            )

            when (val res = User.getDetails(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("testuser", res.data.user.name)
                    assertEquals(2, res.data.posts.size)
                    assertEquals(2, res.data.comments.size)
                }
            }
        }
    }

    @Test
    fun `get user mentions`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = GET_USER_MENTIONS_RESPONSE,
                endpoint = "/user/mention",
                queryParams = "?sort=Active&limit=2&unread_only=false&auth=testauth"
            )

            val form = UserMentionsForm(
                sort = SortType.ACTIVE,
                page = null,
                limit = 2,
                unreadOnly = false,
                auth = "testauth"
            )

            when (val res = User.getMentions(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals(1, res.data.mentions.size)
                }
            }
        }
    }

    @Test
    fun `get user replies`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = GET_REPLIES_RESPONSE,
                endpoint = "/user/replies",
                queryParams = "?sort=Active&limit=2&unread_only=false&auth=testauth"
            )

            val form = GetRepliesForm(
                sort = SortType.ACTIVE,
                page = null,
                limit = 2,
                unreadOnly = false,
                auth = "testauth"
            )

            when (val res = User.getReplies(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals(1, res.data.replies.size)
                }
            }
        }
    }

    @Test
    fun `get user followed communities`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = GET_FOLLOWED_COMMUNITIES_RESPONSE,
                endpoint = "/user/followed_communities",
                queryParams = "?auth=testauth"
            )

            when (val res = User.getFollowedCommunities(Auth("testauth"))) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals(2, res.data.communities.size)
                }
            }
        }
    }

}
