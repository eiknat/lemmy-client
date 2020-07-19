package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.APIResult
import com.eiknat.lemmyclient.apipublic.user.RegisterRequest
import com.eiknat.lemmyclient.websocket.WebSocketClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ObsoleteCoroutinesApi
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test
import kotlin.test.assertNotNull
import kotlin.test.asserter

@ObsoleteCoroutinesApi
internal class RegisterTest {

    private val testThread = newSingleThreadContext("testthread")

    @Before
    fun setUp() {
        Dispatchers.setMain(testThread)
        WebSocketClient.host = "127.0.0.1"
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
        testThread.close()
    }

    @Test
    fun `test register`() {
        runBlocking {
            data class RegisterRequestz(
                override val username: String,
                override val email: String?,
                override val password: String,
                override val passwordVerification: String,
                override val admin: Boolean,
                override val showNsfw: Boolean
            ) : RegisterRequest

            val request = RegisterRequestz(
                username = "eiknatzz",
                email = null,
                password = "Xsqfbdo-akaTqNmsZ8a*",
                passwordVerification = "Xsqfbdo-akaTqNmsZ8a*",
                admin = false,
                showNsfw = true
            )
            when (val response = UserAPI.register(request)) {
                is APIResult.Failure -> {
                    println(response.error); asserter.fail("request should not have failed")
                }
                is APIResult.Success -> {
                    assertNotNull(response.t.jwt, "data exists")
                }
            }
        }
    }
}
