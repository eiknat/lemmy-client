package com.eiknat.lemmyclient.api.comment.json

internal const val COMMENT_RESPONSE = """
{
  "comment": {
    "id": 5513,
    "creator_id": 1201,
    "post_id": 1,
    "parent_id": null,
    "content": "test comment",
    "removed": false,
    "read": false,
    "published": "2020-09-16T03:07:59.624949",
    "updated": null,
    "deleted": false,
    "ap_id": "https://test.org/comment/5513",
    "local": true,
    "community_id": 2,
    "community_actor_id": "https://my_domain/c/communism",
    "community_local": true,
    "community_name": "communism",
    "banned": false,
    "banned_from_community": false,
    "creator_actor_id": "https://test.org/u/testuser",
    "creator_local": true,
    "creator_name": "testuser",
    "creator_avatar": null,
    "score": 1,
    "upvotes": 1,
    "downvotes": 0,
    "hot_rank": 0,
    "user_id": 1201,
    "my_vote": 1,
    "subscribed": true,
    "saved": false
  },
  "recipient_ids": [],
  "form_id": null
}
"""