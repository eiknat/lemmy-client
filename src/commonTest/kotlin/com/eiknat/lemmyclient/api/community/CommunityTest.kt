package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.SortType
import com.eiknat.lemmyclient.api.community.form.GetCommunityForm
import com.eiknat.lemmyclient.api.community.form.ListCommunitiesForm
import com.eiknat.lemmyclient.api.community.json.GET_COMMUNITY_RESPONSE
import com.eiknat.lemmyclient.api.community.json.LIST_COMMUNITIES_RESPONSE
import com.eiknat.lemmyclient.utils.MockClient
import com.eiknat.lemmyclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.asserter

internal class CommunityTest {

    @Test
    fun `get community by id`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = GET_COMMUNITY_RESPONSE,
                endpoint = "/community",
                queryParams = "?id=2"
            )

            val form = GetCommunityForm(
                id = 2,
                name = null,
                auth = null,
            )

            when (val res = Community.get(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val community = res.data.community
                    assertEquals(2, community.id, "response gets community id 2")
                    assertEquals("main", community.name, "deserialized community name correctly")
                }
            }
        }
    }

    @Test
    fun `get community by name`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = GET_COMMUNITY_RESPONSE,
                endpoint = "/community",
                queryParams = "?name=main"
            )

            val form = GetCommunityForm(
                id = null,
                name = "main",
                auth = null,
            )

            when (val res = Community.get(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    val community = res.data.community
                    assertEquals(2, community.id, "response gets community id 2")
                    assertEquals("main", community.name, "deserialized community name correctly")
                }
            }
        }
    }

    @Test
    fun `list communities`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = LIST_COMMUNITIES_RESPONSE,
                endpoint = "/community/list",
                queryParams = "?sort=Active&limit=2"
            )

            val form = ListCommunitiesForm(
                sort = SortType.ACTIVE,
                page = null,
                limit = 2,
                auth = null
            )

            when (val res = Community.list(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals(2, res.data.communities.size, "response has two comments")
                    val community = res.data.communities.first()
                    assertEquals("community1234", community.name, "deserialized community name correctly")
                }
            }
        }
    }

}
