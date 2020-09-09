package com.eiknat.lemmyclient.api.comment

import com.eiknat.lemmyclient.internal.Endpoint
import com.eiknat.lemmyclient.api.comment.form.*
import com.eiknat.lemmyclient.api.comment.response.CommentResponse
import com.eiknat.lemmyclient.api.comment.response.GetCommentsResponse
import com.eiknat.lemmyclient.client.HttpAPI

object Comment {

    suspend fun list(form: GetCommentsForm): GetCommentsResponse {
        return HttpAPI.get(Endpoint("/comment/list"), form.toParams())
    }

    suspend fun create(form: CreateCommentForm): CommentResponse {
        return HttpAPI.post(Endpoint("/comment"), form)
    }

    suspend fun edit(form: EditCommentForm): CommentResponse {
        return HttpAPI.put(Endpoint("/comment"), form)
    }

    suspend fun delete(form: DeleteCommentForm): CommentResponse {
        return HttpAPI.post(Endpoint("/comment/delete"), form)
    }

    suspend fun remove(form: RemoveCommentForm): CommentResponse {
        return HttpAPI.post(Endpoint("/comment/remove"), form)
    }

    suspend fun markAsRead(form: MarkCommentAsReadForm): CommentResponse {
        return HttpAPI.post(Endpoint("/comment/mark_as_read"), form)
    }

    suspend fun like(form: CommentLikeForm): CommentResponse {
        return HttpAPI.post(Endpoint("/comment/like"), form)
    }

    suspend fun save(form: SaveCommentForm): CommentResponse {
        return HttpAPI.post(Endpoint("/comment/save"), form)
    }
}
