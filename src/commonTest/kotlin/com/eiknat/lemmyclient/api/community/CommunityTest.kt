package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.SortType
import com.eiknat.lemmyclient.api.community.form.*
import com.eiknat.lemmyclient.api.community.json.ADD_MOD_TO_COMMUNITY_RESPONSE
import com.eiknat.lemmyclient.api.community.json.COMMUNITY_RESPONSE
import com.eiknat.lemmyclient.api.community.json.GET_COMMUNITY_RESPONSE
import com.eiknat.lemmyclient.api.community.json.LIST_COMMUNITIES_RESPONSE
import com.eiknat.lemmyclient.api.user.json.BAN_USER_RESPONSE
import com.eiknat.lemmyclient.utils.MockClient
import com.eiknat.lemmyclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
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

    @Test
    fun `create community`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = COMMUNITY_RESPONSE,
                endpoint = "/community",
            )

            val form = CreateCommunityForm(
                name = "testcommunity",
                title = "test community",
                description = "desc",
                icon = null,
                banner = null,
                categoryId = 1,
                nsfw = false,
                auth = "testauth"
            )

            when (val res = Community.create(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("testcommunity", res.data.community.name)
                }
            }
        }
    }

    @Test
    fun `edit community`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Put,
                responseJson = COMMUNITY_RESPONSE,
                endpoint = "/community",
            )

            val form = EditCommunityForm(
                communityId = 145,
                name = "testcommunity",
                title = "test community",
                description = "desc",
                icon = null,
                banner = null,
                categoryId = 1,
                nsfw = false,
                auth = "testauth"
            )

            when (val res = Community.edit(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("testcommunity", res.data.community.name)
                }
            }
        }
    }

    @Test
    fun `transfer community`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = GET_COMMUNITY_RESPONSE,
                endpoint = "/community/transfer",
            )

            val form = TransferCommunityForm(
                communityId = 2,
                transferUserId = 2,
                auth = "testauth"
            )

            when (val res = Community.transfer(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("main", res.data.community.name)
                }
            }
        }
    }

    @Test
    fun `delete community`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = COMMUNITY_RESPONSE,
                endpoint = "/community/delete",
            )

            val form = DeleteCommunityForm(
                communityId = 145,
                deleted = false,
                auth = "testauth"
            )

            when (val res = Community.delete(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("testcommunity", res.data.community.name)
                }
            }
        }
    }

    @Test
    fun `remove community`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = COMMUNITY_RESPONSE,
                endpoint = "/community/remove",
            )

            val form = RemoveCommunityForm(
                communityId = 145,
                removed = false,
                reason = "test reason",
                expires = null,
                auth = "testauth"
            )

            when (val res = Community.remove(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("testcommunity", res.data.community.name)
                }
            }
        }
    }

    @Test
    fun `follow community`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = COMMUNITY_RESPONSE,
                endpoint = "/community/follow",
            )

            val form = FollowCommunityForm(
                communityId = 145,
                follow = true,
                auth = "testauth"
            )

            when (val res = Community.follow(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("testcommunity", res.data.community.name)
                }
            }
        }
    }

    @Test
    fun `ban user from community`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = BAN_USER_RESPONSE,
                endpoint = "/community/ban_user",
            )

            val form = BanFromCommunityForm(
                communityId = 145,
                userId = 4211,
                ban = true,
                shouldRemoveData = false,
                reason = "test reason",
                expires = null,
                auth = "testauth"
            )

            when (val res = Community.banUser(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertTrue(res.data.banned)
                }
            }
        }
    }

    @Test
    fun `add mod to community`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = ADD_MOD_TO_COMMUNITY_RESPONSE,
                endpoint = "/community/mod",
            )

            val form = AddModToCommunityForm(
                communityId = 145,
                userId = 2,
                added = true,
                auth = "testauth"
            )

            when (val res = Community.addMod(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals(2, res.data.moderators.size)
                }
            }
        }
    }
}
