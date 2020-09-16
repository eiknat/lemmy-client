package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.SortType
import com.eiknat.lemmyclient.api.auth.Auth
import com.eiknat.lemmyclient.api.user.form.*
import com.eiknat.lemmyclient.api.user.json.*
import com.eiknat.lemmyclient.utils.MockClient
import com.eiknat.lemmyclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.*

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
                    assertEquals(2, res.data.mentions.size)
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

    @Test
    fun `register user`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = LOGIN_RESPONSE,
                endpoint = "/user/register",
            )

            val form = RegisterForm(
                username = "eiknat1kt",
                email = null,
                password = "test1234",
                passwordVerify = "test1234",
                admin = false,
                showNsfw = true,
                captchaUuid = null,
                captchaAnswer = null,
            )

            when (val res = User.register(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("jfoafioajijsf8afy78anfa.af8a9unda-afja8f7a8", res.data.jwt)
                }
            }
        }
    }

    @Test
    fun `login user`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = LOGIN_RESPONSE,
                endpoint = "/user/login",
            )

            val form = LoginForm(
                usernameOrEmail = "eiknat1kt",
                password = "test1234",
            )

            when (val res = User.login(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("jfoafioajijsf8afy78anfa.af8a9unda-afja8f7a8", res.data.jwt)
                }
            }
        }
    }

    @Test
    fun `reset password`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = "{}",
                endpoint = "/user/password_reset",
            )

            val form = PasswordResetForm(
                email = "test@testemail.com"
            )

            when (val res = User.resetPassword(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertNotNull(res.data)
                }
            }
        }
    }

    @Test
    fun `change password`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = LOGIN_RESPONSE,
                endpoint = "/user/password_change",
            )

            val form = PasswordChangeForm(
                token = "AAKJfakKajA8adnja887",
                password = "test1234",
                passwordVerify = "test1234"
            )

            when (val res = User.changePassword(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("jfoafioajijsf8afy78anfa.af8a9unda-afja8f7a8", res.data.jwt)
                }
            }
        }
    }

    @Test
    fun `user join`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = """{"user_id":1201}""",
                endpoint = "/user/join",
            )

            when (val res = User.join(Auth("testauth"))) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals(1201, res.data.userId)
                }
            }
        }
    }

    @Test
    fun `mark user mentions as read`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = USER_MENTION_RESPONSE,
                endpoint = "/user/mention/mark_as_read",
            )
//            LemmyAPI("https://thoseamongbranches.chapo.chat")
//            LemmyAPI("http://127.0.0.1:8536")

            val form = MarkUserMentionAsReadForm(
                userMentionId = 45,
                read = true,
                auth = "testauth"
            )

            when (val res = User.markMentionAsRead(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals(5118, res.data.mention.id)
                }
            }
        }
    }

    @Test
    fun `delete account`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = LOGIN_RESPONSE,
                endpoint = "/user/delete_account",
            )

            val form = DeleteAccountForm(
                password = "test1234",
                auth = "testauth"
            )

            when (val res = User.deleteAccount(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("jfoafioajijsf8afy78anfa.af8a9unda-afja8f7a8", res.data.jwt)
                }
            }
        }
    }

    @Test
    fun `ban user`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = BAN_USER_RESPONSE,
                endpoint = "/user/ban",
            )

            val form = BanUserForm(
                userId = 4211,
                isBanned = true,
                removeData = false,
                reason = "test reason",
                expires = null,
                auth = "testauth"
            )

            when (val res = User.ban(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertTrue(res.data.isBanned)
                }
            }
        }
    }
}
