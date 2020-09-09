package com.eiknat.lemmyclient.api.post

import com.eiknat.lemmyclient.internal.Endpoint
import com.eiknat.lemmyclient.api.post.form.*
import com.eiknat.lemmyclient.api.post.response.GetPostResponse
import com.eiknat.lemmyclient.api.post.response.GetPostsResponse
import com.eiknat.lemmyclient.api.post.response.PostResponse
import com.eiknat.lemmyclient.client.HttpAPI

object Post {
    private val post = Endpoint("/post")

    suspend fun get(form: GetPostForm): GetPostResponse {
        return HttpAPI.get(post, form.toParams())
    }

    suspend fun list(form: GetPostsForm): GetPostsResponse {
        return HttpAPI.get(Endpoint("/post/list"), form.toParams())
    }

    suspend fun create(form: CreatePostForm): PostResponse {
        return HttpAPI.post(post, form)
    }

    suspend fun edit(form: EditPostForm): PostResponse {
        return HttpAPI.put(post, form)
    }

    suspend fun delete(form: DeletePostForm): PostResponse {
        return HttpAPI.post(Endpoint("/post/delete"), form)
    }

    suspend fun remove(form: RemovePostForm): PostResponse {
        return HttpAPI.post(Endpoint("/post/remove"), form)
    }

    suspend fun lock(form: LockPostForm): PostResponse {
        return HttpAPI.post(Endpoint("/post/lock"), form)
    }

    suspend fun sticky(form: StickyPostForm): PostResponse {
        return HttpAPI.post(Endpoint("/post/sticky"), form)
    }

    suspend fun like(form: LikePostForm): PostResponse {
        return HttpAPI.post(Endpoint("/post/like"), form)
    }

    suspend fun save(form: SavePostForm): PostResponse {
        return HttpAPI.post(Endpoint("/post/save"), form)
    }
}
