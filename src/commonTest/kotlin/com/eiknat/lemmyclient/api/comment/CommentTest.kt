package com.eiknat.lemmyclient.api.comment

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.ListingType
import com.eiknat.lemmyclient.api.SortType
import com.eiknat.lemmyclient.api.comment.form.*
import com.eiknat.lemmyclient.api.comment.json.COMMENT_RESPONSE
import com.eiknat.lemmyclient.api.comment.json.GET_COMMENTS_RESPONSE
import com.eiknat.lemmyclient.utils.MockClient
import com.eiknat.lemmyclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.asserter

internal class CommentTest {

    @Test
    fun `list comments`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = GET_COMMENTS_RESPONSE,
                endpoint = "/comment/list",
                queryParams = "?type_=All&sort=Active&limit=2&community_id=2"
            )

            val form = GetCommentsForm(
                type = ListingType.ALL,
                sort = SortType.ACTIVE,
                page = null,
                limit = 2,
                communityId = 2,
                communityName = null,
                auth = null
            )

            when (val res = Comment.list(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals(2, res.data.comments.size, "response has two comments")
                    val comment = res.data.comments.first()
                    assertEquals(2, comment.communityId, "deserialized community id correctly")
                }
            }
        }
    }

    @Test
    fun `create comment`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = COMMENT_RESPONSE,
                endpoint = "/comment",
            )

            val form = CreateCommentForm(
                content = "test comment",
                creatorId = 1201,
                parentId = null,
                postId = 1,
                auth = "testauth"
            )

            when (val res = Comment.create(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val comment = res.data.comment
                    assertEquals(5513, comment.id)
                    assertEquals("test comment", comment.content)
                }
            }
        }
    }

    @Test
    fun `edit comment`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Put,
                responseJson = COMMENT_RESPONSE,
                endpoint = "/comment",
            )

            val form = EditCommentForm(
                commentId = 5513,
                content = "test comment",
                creatorId = 1201,
                parentId = null,
                postId = 1,
                auth = "testauth"
            )

            when (val res = Comment.edit(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val comment = res.data.comment
                    assertEquals(5513, comment.id)
                    assertEquals("test comment", comment.content)
                }
            }
        }
    }

    @Test
    fun `delete comment`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = COMMENT_RESPONSE,
                endpoint = "/comment/delete",
            )

            val form = DeleteCommentForm(
                commentId = 5513,
                deleted = true,
                auth = "testauth"
            )

            when (val res = Comment.delete(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val comment = res.data.comment
                    assertEquals(5513, comment.id)
                    assertEquals("test comment", comment.content)
                }
            }
        }
    }

    @Test
    fun `remove comment`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = COMMENT_RESPONSE,
                endpoint = "/comment/remove",
            )

            val form = RemoveCommentForm(
                commentId = 5513,
                removed = true,
                reason = "spam",
                auth = "testauth"
            )

            when (val res = Comment.remove(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val comment = res.data.comment
                    assertEquals(5513, comment.id)
                    assertEquals("test comment", comment.content)
                }
            }
        }
    }

    @Test
    fun `mark comment as read`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = COMMENT_RESPONSE,
                endpoint = "/comment/mark_as_read",
            )

            val form = MarkCommentAsReadForm(
                commentId = 5513,
                read = false,
                auth = "testauth"
            )

            when (val res = Comment.markAsRead(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val comment = res.data.comment
                    assertEquals(5513, comment.id)
                    assertEquals("test comment", comment.content)
                }
            }
        }
    }

    @Test
    fun `like comment`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = COMMENT_RESPONSE,
                endpoint = "/comment/like",
            )

            val form = LikeCommentForm(
                commentId = 5513,
                score = 1,
                auth = "testauth"
            )

            when (val res = Comment.like(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val comment = res.data.comment
                    assertEquals(5513, comment.id)
                    assertEquals("test comment", comment.content)
                }
            }
        }
    }

    @Test
    fun `save comment`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Put,
                responseJson = COMMENT_RESPONSE,
                endpoint = "/comment/save",
            )

            val form = SaveCommentForm(
                commentId = 5513,
                save = true,
                auth = "testauth"
            )

            when (val res = Comment.save(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val comment = res.data.comment
                    assertEquals(5513, comment.id)
                    assertEquals("test comment", comment.content)
                }
            }
        }
    }
}
