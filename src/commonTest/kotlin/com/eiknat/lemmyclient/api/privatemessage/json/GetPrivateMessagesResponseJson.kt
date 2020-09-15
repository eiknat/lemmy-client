package com.eiknat.lemmyclient.api.privatemessage.json

internal const val GET_PRIVATE_MESSAGES_RESPONSE = """
{
  "messages": [
    {
      "id": 717,
      "creator_id": 14212,
      "recipient_id": 12171,
      "content": "test",
      "deleted": false,
      "read": false,
      "published": "2020-09-14T21:54:09.736189",
      "updated": null,
      "ap_id": "https://test.org/private_message/717",
      "local": true,
      "creator_name": "testuser2",
      "creator_preferred_username": null,
      "creator_avatar": null,
      "creator_actor_id": "https://test.org/u/testuser2",
      "creator_local": true,
      "recipient_name": "testuser1",
      "recipient_preferred_username": null,
      "recipient_avatar": null,
      "recipient_actor_id": "https://test.org/u/testuser1",
      "recipient_local": true
    },
    {
      "id": 716,
      "creator_id": 14212,
      "recipient_id": 12171,
      "content": "this is a test message",
      "deleted": false,
      "read": false,
      "published": "2020-09-14T21:53:55.429372",
      "updated": null,
      "ap_id": "https://test.org/private_message/716",
      "local": true,
      "creator_name": "testuser2",
      "creator_preferred_username": null,
      "creator_avatar": null,
      "creator_actor_id": "https://test.org/u/testuser2",
      "creator_local": true,
      "recipient_name": "testuser1",
      "recipient_preferred_username": null,
      "recipient_avatar": null,
      "recipient_actor_id": "https://test.org/u/testuser1",
      "recipient_local": true
    }
  ]
}
"""