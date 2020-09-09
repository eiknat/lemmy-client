package com.eiknat.lemmyclient.api.privatemessage

import com.eiknat.lemmyclient.internal.Endpoint
import com.eiknat.lemmyclient.api.privatemessage.form.*
import com.eiknat.lemmyclient.api.privatemessage.response.PrivateMessageResponse
import com.eiknat.lemmyclient.api.privatemessage.response.PrivateMessagesResponse
import com.eiknat.lemmyclient.client.HttpAPI

object PrivateMessage {

    suspend fun list(form: GetPrivateMessagesForm): PrivateMessagesResponse {
        return HttpAPI.get(Endpoint("/private_message/list"), form.toParams())
    }

    suspend fun create(form: PrivateMessageForm): PrivateMessageResponse {
        return HttpAPI.post(Endpoint("/private_message"), form)
    }

    suspend fun edit(form: EditPrivateMessageForm): PrivateMessageResponse {
        return HttpAPI.put(Endpoint("/private_message"), form)
    }

    suspend fun delete(form: DeletePrivateMessageForm): PrivateMessageResponse {
        return HttpAPI.post(Endpoint("/private_message/delete"), form)
    }

    suspend fun markAsRead(form: MarkPrivateMessageAsReadForm): PrivateMessageResponse {
        return HttpAPI.post(Endpoint("/private_message/mark_as_read"), form)
    }
}
