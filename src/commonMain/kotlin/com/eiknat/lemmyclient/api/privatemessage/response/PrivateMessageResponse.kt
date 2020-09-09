package com.eiknat.lemmyclient.api.privatemessage.response

import com.eiknat.lemmyclient.api.privatemessage.model.PrivateMessage
import kotlinx.serialization.Serializable

@Serializable
data class PrivateMessageResponse(val message: PrivateMessage)
