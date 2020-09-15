package com.eiknat.lemmyclient.api.post

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.ListingType
import com.eiknat.lemmyclient.api.SortType
import com.eiknat.lemmyclient.api.post.form.GetPostForm
import com.eiknat.lemmyclient.api.post.form.GetPostsForm
import com.eiknat.lemmyclient.api.post.json.GET_POSTS_RESPONSE
import com.eiknat.lemmyclient.api.post.json.GET_POST_RESPONSE
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

}
