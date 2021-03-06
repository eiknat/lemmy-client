package com.eiknat.lemmyclient.api.post

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.post.form.*
import com.eiknat.lemmyclient.api.post.response.GetPostResponse
import com.eiknat.lemmyclient.api.post.response.GetPostsResponse
import com.eiknat.lemmyclient.api.post.response.PostResponse
import com.eiknat.lemmyclient.client.HttpAPI
import com.eiknat.lemmyclient.internal.Endpoint

object Post {
    private val post = Endpoint("/post")

    suspend fun get(form: GetPostForm): APIResponse<GetPostResponse> {
        return HttpAPI.get(post, form.toParams())
    }

    suspend fun list(form: GetPostsForm): APIResponse<GetPostsResponse> {
        return HttpAPI.get(Endpoint("/post/list"), form.toParams())
    }

    suspend fun create(form: CreatePostForm): APIResponse<PostResponse> {
        return HttpAPI.post(post, form)
    }

    suspend fun edit(form: EditPostForm): APIResponse<PostResponse> {
        return HttpAPI.put(post, form)
    }

    suspend fun delete(form: DeletePostForm): APIResponse<PostResponse> {
        return HttpAPI.post(Endpoint("/post/delete"), form)
    }

    suspend fun remove(form: RemovePostForm): APIResponse<PostResponse> {
        return HttpAPI.post(Endpoint("/post/remove"), form)
    }

    suspend fun lock(form: LockPostForm): APIResponse<PostResponse> {
        return HttpAPI.post(Endpoint("/post/lock"), form)
    }

    suspend fun sticky(form: StickyPostForm): APIResponse<PostResponse> {
        return HttpAPI.post(Endpoint("/post/sticky"), form)
    }

    suspend fun like(form: LikePostForm): APIResponse<PostResponse> {
        return HttpAPI.post(Endpoint("/post/like"), form)
    }

    suspend fun save(form: SavePostForm): APIResponse<PostResponse> {
        return HttpAPI.put(Endpoint("/post/save"), form)
    }
}
