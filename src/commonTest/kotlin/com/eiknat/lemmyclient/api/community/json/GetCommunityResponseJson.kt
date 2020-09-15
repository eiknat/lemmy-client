package com.eiknat.lemmyclient.api.community.json

internal const val GET_COMMUNITY_RESPONSE = """
{
  "community": {
    "id": 2,
    "actor_id": "https://test.org/c/main",
    "local": true,
    "name": "main",
    "title": "Main",
    "icon": "https://test.org/pictrs/image/img.png",
    "banner": null,
    "description": "main community",
    "category_id": 25,
    "creator_id": 34,
    "removed": false,
    "deleted": false,
    "nsfw": false,
    "published": "2019-06-02T16:43:50.799554",
    "updated": "2020-08-05T18:57:21.485598",
    "creator_actor_id": "https://test.org/u/testuser1",
    "creator_local": true,
    "last_refreshed_at": "2020-06-30T00:49:41.771510",
    "creator_name": "testuser1",
    "creator_preferred_username": "testuser1",
    "creator_avatar": "https://test.org/pictrs/image/img.jpg",
    "category_name": "Meta",
    "number_of_subscribers": 5349,
    "number_of_posts": 255,
    "number_of_comments": 1636,
    "user_id": null,
    "subscribed": null
  },
  "moderators": [
    {
      "id": 14452,
      "user_id": 34,
      "user_actor_id": "https://test.org/u/testuser1",
      "user_local": true,
      "user_name": "testuser1",
      "user_preferred_username": "testuser1",
      "avatar": "https://test.org/pictrs/image/img.jpg",
      "community_id": 2,
      "community_actor_id": "https://test.org/c/main",
      "community_local": true,
      "community_name": "main",
      "community_icon": "https://test.org/pictrs/image/img.png",
      "published": "2019-06-02T16:46:58.668443"
    },
    {
      "id": 12,
      "user_id": 335,
      "user_actor_id": "https://test.org/u/testuser4",
      "user_local": true,
      "user_name": "testuser4",
      "user_preferred_username": null,
      "avatar": "https://test.org/pictrs/image/img.png",
      "community_id": 2,
      "community_actor_id": "https://test.org/c/main",
      "community_local": true,
      "community_name": "main",
      "community_icon": "https://test.org/pictrs/image/img.png",
      "published": "2019-12-22T14:38:36.528814"
    },
    {
      "id": 41,
      "user_id": 2,
      "user_actor_id": "https://test.org/u/testuser",
      "user_local": true,
      "user_name": "testuser",
      "user_preferred_username": null,
      "avatar": "https://test.org/pictrs/image/img.png",
      "community_id": 2,
      "community_actor_id": "https://test.org/c/main",
      "community_local": true,
      "community_name": "main",
      "community_icon": "https://test.org/pictrs/image/img.png",
      "published": "2020-06-29T00:01:41.217256"
    }
  ],
  "online": 1
}
"""