package com.eiknat.lemmyclient.api.privatemessage

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.privatemessage.form.*
import com.eiknat.lemmyclient.api.privatemessage.response.PrivateMessageResponse
import com.eiknat.lemmyclient.api.privatemessage.response.PrivateMessagesResponse
import com.eiknat.lemmyclient.client.HttpAPI
import com.eiknat.lemmyclient.internal.Endpoint

object PrivateMessage {

    suspend fun list(form: GetPrivateMessagesForm): APIResponse<PrivateMessagesResponse> {
        return HttpAPI.get(Endpoint("/private_message/list"), form.toParams())
    }

    suspend fun create(form: PrivateMessageForm): APIResponse<PrivateMessageResponse> {
        return HttpAPI.post(Endpoint("/private_message"), form)
    }

    suspend fun edit(form: EditPrivateMessageForm): APIResponse<PrivateMessageResponse> {
        return HttpAPI.put(Endpoint("/private_message"), form)
    }

    suspend fun delete(form: DeletePrivateMessageForm): APIResponse<PrivateMessageResponse> {
        return HttpAPI.post(Endpoint("/private_message/delete"), form)
    }

    suspend fun markAsRead(form: MarkPrivateMessageAsReadForm): APIResponse<PrivateMessageResponse> {
        return HttpAPI.post(Endpoint("/private_message/mark_as_read"), form)
    }
}
