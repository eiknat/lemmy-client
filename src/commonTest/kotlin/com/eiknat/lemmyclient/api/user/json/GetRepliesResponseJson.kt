package com.eiknat.lemmyclient.api.user.json

internal const val GET_REPLIES_RESPONSE = """
{
  "replies": [
    {
      "id": 17667,
      "creator_id": 10475,
      "post_id": 40282,
      "parent_id": null,
      "content": "Test.",
      "removed": false,
      "read": false,
      "published": "2020-09-10T04:46:18.125649",
      "updated": null,
      "deleted": false,
      "ap_id": "https://test.org/comment/17667",
      "local": true,
      "community_id": 2,
      "community_actor_id": "https://test.org/c/announcements",
      "community_local": true,
      "community_name": "announcements",
      "banned": false,
      "banned_from_community": false,
      "creator_actor_id": "https://test.org/u/tester",
      "creator_local": true,
      "creator_name": "tester",
      "creator_avatar": null,
      "score": 2,
      "upvotes": 2,
      "downvotes": 0,
      "hot_rank": 6,
      "user_id": null,
      "my_vote": null,
      "subscribed": false,
      "saved": false
    }
  ]
}
"""