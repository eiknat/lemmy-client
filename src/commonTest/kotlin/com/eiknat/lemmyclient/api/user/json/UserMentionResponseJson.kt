package com.eiknat.lemmyclient.api.user.json

internal const val USER_MENTION_RESPONSE = """
{
  "mention": {
    "id": 5118,
    "user_mention_id": 45,
    "creator_id": 4,
    "creator_actor_id": "https://test.org/u/TestUser1",
    "creator_local": true,
    "post_id": 953,
    "post_name": "test mention post",
    "parent_id": null,
    "content": "[@TestUser2@test.org](/u/TestUser2) what's gooooooooooooood?",
    "removed": false,
    "read": false,
    "published": "2020-09-10T00:29:39.084765",
    "updated": null,
    "deleted": false,
    "community_id": 2,
    "community_actor_id": "https://test.org/c/testcomm",
    "community_local": true,
    "community_name": "testcomm",
    "community_icon": null,
    "banned": false,
    "banned_from_community": false,
    "creator_name": "TestUser1",
    "creator_preferred_username": null,
    "creator_avatar": "https://test.org/pictrs/image/img.jpg",
    "score": 1,
    "upvotes": 1,
    "downvotes": 0,
    "hot_rank": 1462,
    "hot_rank_active": 1603,
    "user_id": 21,
    "my_vote": 0,
    "saved": false,
    "recipient_id": 21,
    "recipient_actor_id": "https://test.org/u/TestUser2",
    "recipient_local": true
  }
}
"""