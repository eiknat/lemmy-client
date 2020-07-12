package com.eiknat.lemmyclient

import com.eiknat.lemmyclient.api.post.GetPost
import io.ktor.util.KtorExperimentalAPI
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.*
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import kotlinx.serialization.ImplicitReflectionSerializer
import org.junit.After
import org.junit.Before
import org.junit.Test
import kotlin.concurrent.thread
import kotlin.coroutines.resume

@KtorExperimentalAPI
@ExperimentalCoroutinesApi
internal class LemmyTest {

    private val mainThreadSurrogate = newSingleThreadContext("testthread")

    @Before
    fun setUp() {
        Dispatchers.setMain(mainThreadSurrogate)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
        mainThreadSurrogate.close()
    }


    @ImplicitReflectionSerializer
    @Test
    fun test() = runBlocking {

        val data = GetPost.Data(657, "")
        val request = GetPost(data)

        LemmyAPI("host").sendRequest(request); Unit
    }


    @Test
    fun demo() {
        runBlocking {
            val message = suspendCancellableCoroutine<String> { c ->
                thread(start = true) {
                    Thread.sleep(10)
                    c.resume("Hello..")
                }
            }

            assertEquals("Hello..", message)
        }
    }
}