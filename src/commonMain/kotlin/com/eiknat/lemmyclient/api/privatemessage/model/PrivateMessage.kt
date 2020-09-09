package com.eiknat.lemmyclient.api.privatemessage.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PrivateMessage(
    val id: Int,
    @SerialName("creator_id")
    val creatorId: Int,
    @SerialName("recipient_id")
    val recipientId: Int,
    val content: String,
    val deleted: Boolean,
    val read: Boolean,
    val published: String,
    val updated: String?,
    @SerialName("ap_id")
    val apId: String,
    val local: Boolean,
    @SerialName("creator_name")
    val creatorName: String,
    @SerialName("creator_preferred_username")
    val creatorPreferredUsername: String?,
    @SerialName("creator_avatar")
    val creatorAvatar: String?,
    @SerialName("creator_actor_id")
    val creatorActorId: String,
    @SerialName("creator_local")
    val creatorLocal: Boolean,
    @SerialName("recipient_name")
    val recipientName: String,
    @SerialName("recipient_preferred_username")
    val recipientPreferredUsername: String?,
    @SerialName("recipient_avatar")
    val recipientAvatar: String?,
    @SerialName("recipient_actor_id")
    val recipientActorId: String,
    @SerialName("recipient_local")
    val recipientLocal: Boolean,
)
