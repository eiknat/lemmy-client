package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.APIResult
import com.eiknat.lemmyclient.websocket.WebSocketClient
import io.ktor.util.KtorExperimentalAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import kotlinx.serialization.ImplicitReflectionSerializer
import org.junit.After
import org.junit.Before
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.asserter

// INFO: mocks aren't set up, run this against your own instance for now
// this is on purpose so we can test requests far more easily
@KtorExperimentalAPI
@ExperimentalCoroutinesApi
@ImplicitReflectionSerializer
internal class UserAPITest {

    private val testThread = newSingleThreadContext("testthread")

    @Before
    fun setUp() {
        Dispatchers.setMain(testThread)
        WebSocketClient.host = ""
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
        testThread.close()
    }

    @Test
    fun `test userJoin`() {
        runBlocking {
            val request = UserJoinRequest(UserJoinRequest.Data(auth))
            when (val response = UserAPI.sendUserJoin(request)) {
                is APIResult.Failure -> { println(response.error); asserter.fail("request should not have failed") }
                is APIResult.Success -> {
                    assertEquals(21, response.data.data.user_id)
                }
            }
        }
    }
}

private const val auth = ""
