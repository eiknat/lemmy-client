package com.eiknat.lemmyclient.api.post

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.ListingType
import com.eiknat.lemmyclient.api.SortType
import com.eiknat.lemmyclient.api.post.form.*
import com.eiknat.lemmyclient.api.post.json.GET_POSTS_RESPONSE
import com.eiknat.lemmyclient.api.post.json.GET_POST_RESPONSE
import com.eiknat.lemmyclient.api.post.json.POST_RESPONSE
import com.eiknat.lemmyclient.utils.MockClient
import com.eiknat.lemmyclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.asserter

internal class PostTest {

    @Test
    fun `get post`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = GET_POST_RESPONSE,
                endpoint = "/post",
                queryParams = "?id=42069"
            )

            val form = GetPostForm(
                id = 42069,
                auth = null
            )

            when (val res = Post.get(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val community = res.data.community
                    val post = res.data.post
                    assertEquals(4343, community.id, "response gets community id 4343")
                    assertEquals("testcommunity", community.name, "deserialized community name correctly")
                    assertEquals("i am a test post", post.name, "deserialized post name correctly")
                    assertEquals(4, res.data.comments.size, "has four comments")
                }
            }
        }
    }

    @Test
    fun `list posts`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = GET_POSTS_RESPONSE,
                endpoint = "/post/list",
                queryParams = "?type_=All&sort=Active&page=1&limit=2&community_id=2"
            )

            val form = GetPostsForm(
                type = ListingType.ALL,
                sort = SortType.ACTIVE,
                page = 1,
                limit = 2,
                communityId = 2,
                communityName = null,
                auth = null
            )

            when (val res = Post.list(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals(2, res.data.posts.size, "response has two posts")
                    val post = res.data.posts.first()
                    assertEquals(341, post.id, "deserialized post id correctly")
                    assertEquals("test post", post.name, "deserialized post name correctly")
                }
            }
        }
    }

    @Test
    fun `create post`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = POST_RESPONSE,
                endpoint = "/post",
            )

            val form = CreatePostForm(
                name = "test",
                url = null,
                body = null,
                communityId = 2,
                nsfw = false,
                auth = "testauth"
            )

            when (val res = Post.create(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val post = res.data.post
                    assertEquals(5146, post.id)
                    assertEquals("test", post.name)
                }
            }
        }
    }

    @Test
    fun `edit post`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Put,
                responseJson = POST_RESPONSE,
                endpoint = "/post",
            )

            val form = EditPostForm(
                postId = 5146,
                name = "test",
                url = null,
                body = null,
                communityId = 2,
                nsfw = false,
                auth = "testauth"
            )

            when (val res = Post.edit(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val post = res.data.post
                    assertEquals(5146, post.id)
                    assertEquals("test", post.name)
                }
            }
        }
    }

    @Test
    fun `delete post`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = POST_RESPONSE,
                endpoint = "/post/delete",
            )

            val form = DeletePostForm(
                postId = 5146,
                deleted = false,
                auth = "testauth"
            )

            when (val res = Post.delete(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val post = res.data.post
                    assertEquals(5146, post.id)
                    assertEquals("test", post.name)
                }
            }
        }
    }

    @Test
    fun `remove post`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = POST_RESPONSE,
                endpoint = "/post/remove",
            )

            val form = RemovePostForm(
                postId = 5146,
                removed = false,
                reason = "test reason",
                auth = "testauth"
            )

            when (val res = Post.remove(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val post = res.data.post
                    assertEquals(5146, post.id)
                    assertEquals("test", post.name)
                }
            }
        }
    }

    @Test
    fun `lock post`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = POST_RESPONSE,
                endpoint = "/post/lock",
            )

            val form = LockPostForm(
                postId = 5146,
                locked = false,
                auth = "testauth"
            )

            when (val res = Post.lock(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val post = res.data.post
                    assertEquals(5146, post.id)
                    assertEquals("test", post.name)
                }
            }
        }
    }

    @Test
    fun `sticky post`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = POST_RESPONSE,
                endpoint = "/post/sticky",
            )

            val form = StickyPostForm(
                postId = 5146,
                stickied = false,
                auth = "testauth"
            )

            when (val res = Post.sticky(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val post = res.data.post
                    assertEquals(5146, post.id)
                    assertEquals("test", post.name)
                }
            }
        }
    }

    @Test
    fun `like post`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = POST_RESPONSE,
                endpoint = "/post/like",
            )

            val form = LikePostForm(
                postId = 5146,
                score = 1,
                auth = "testauth"
            )

            when (val res = Post.like(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val post = res.data.post
                    assertEquals(5146, post.id)
                    assertEquals("test", post.name)
                }
            }
        }
    }

    @Test
    fun `save post`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Put,
                responseJson = POST_RESPONSE,
                endpoint = "/post/save",
            )

            val form = SavePostForm(
                postId = 5146,
                save = true,
                auth = "testauth"
            )

            when (val res = Post.save(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val post = res.data.post
                    assertEquals(5146, post.id)
                    assertEquals("test", post.name)
                }
            }
        }
    }

}
