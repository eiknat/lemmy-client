package com.eiknat.lemmyclient.api.privatemessage.json

internal const val PRIVATE_MESSAGE_RESPONSE = """
{
  "message": {
    "id": 131,
    "creator_id": 1201,
    "recipient_id": 1202,
    "content": "hello",
    "deleted": true,
    "read": false,
    "published": "2020-09-16T17:16:21.373738",
    "updated": null,
    "ap_id": "https://test.org/private_message/131",
    "local": true,
    "creator_name": "testuser",
    "creator_preferred_username": null,
    "creator_avatar": null,
    "creator_actor_id": "https://test.org/u/testuser",
    "creator_local": true,
    "recipient_name": "testuser2",
    "recipient_preferred_username": null,
    "recipient_avatar": null,
    "recipient_actor_id": "https://test.org/u/testuser2",
    "recipient_local": true
  }
}
"""