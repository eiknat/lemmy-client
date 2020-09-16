package com.eiknat.lemmyclient.api.site

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.auth.Auth
import com.eiknat.lemmyclient.api.site.form.SiteForm
import com.eiknat.lemmyclient.api.site.form.TransferSiteForm
import com.eiknat.lemmyclient.api.site.json.GET_SITE_CONFIG_RESPONSE
import com.eiknat.lemmyclient.api.site.json.GET_SITE_RESPONSE
import com.eiknat.lemmyclient.api.site.json.SITE_RESPONSE
import com.eiknat.lemmyclient.utils.MockClient
import com.eiknat.lemmyclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.asserter

internal class SiteTest {

    @Test
    fun `get site`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = GET_SITE_RESPONSE,
                endpoint = "/site",
                queryParams = "?auth=testauth"
            )

            when (val res = Site.get(Auth("testauth"))) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("v0.7.57", res.data.version, "version deserializes correctly")
                }
            }
        }
    }

    @Test
    fun `get site config`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Get,
                responseJson = GET_SITE_CONFIG_RESPONSE,
                endpoint = "/site/config",
                queryParams = "?auth=testauth"
            )

            when (val res = Site.getConfig(Auth("testauth"))) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertTrue(res.data.configHjson.isNotEmpty(), "config_hjson is returned")
                }
            }
        }
    }

    @Test
    fun `create site`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = SITE_RESPONSE,
                endpoint = "/site",
            )

            val form = SiteForm(
                name = "testsite2",
                description = "test description",
                icon = null,
                banner = null,
                enableDownvotes = true,
                openRegistration = true,
                enableNsfw = true,
                auth = "testauth"
            )

            when (val res = Site.create(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("testsite", res.data.site.name)
                }
            }
        }
    }

    @Test
    fun `transfer site`() {
        executeTest {
            MockClient(
                httpMethod = HttpMethod.Post,
                responseJson = GET_SITE_RESPONSE,
                endpoint = "/site/transfer",
            )

            val form = TransferSiteForm(
                userId = 1201,
                auth = "testauth"
            )

            when (val res = Site.transfer(form)) {
                is APIResponse.Error -> { println("${res.statusCode} :: ${res.message}") ; asserter.fail("should not have failed") }
                is APIResponse.Ok -> {
                    assertEquals("testsite", res.data.site.name)
                }
            }
        }
    }

}
