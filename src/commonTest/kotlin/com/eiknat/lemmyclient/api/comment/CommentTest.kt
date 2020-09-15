package com.eiknat.lemmyclient.api.comment

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.ListingType
import com.eiknat.lemmyclient.api.SortType
import com.eiknat.lemmyclient.api.comment.form.GetCommentsForm
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
}
