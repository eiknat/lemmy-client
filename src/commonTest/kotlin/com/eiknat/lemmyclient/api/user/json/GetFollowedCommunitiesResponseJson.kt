package com.eiknat.lemmyclient.api.user.json

internal const val GET_FOLLOWED_COMMUNITIES_RESPONSE = """
{
  "communities": [
    {
      "id": 55933,
      "user_id": 3431,
      "user_actor_id": "https://test.org/u/testuser",
      "user_local": true,
      "user_name": "testuser",
      "user_preferred_username": null,
      "avatar": null,
      "community_id": 2,
      "community_actor_id": "https://test.org/c/main",
      "community_local": true,
      "community_name": "main",
      "community_icon": "https://test.org/pictrs/image/img.png",
      "published": "2020-06-30T03:49:15.551702"
    },
    {
      "id": 12312,
      "user_id": 3431,
      "user_actor_id": "https://test.org/u/testuser",
      "user_local": true,
      "user_name": "testuser",
      "user_preferred_username": null,
      "avatar": null,
      "community_id": 343,
      "community_actor_id": "https://test.org/c/testcomm",
      "community_local": true,
      "community_name": "testcomm",
      "community_icon": null,
      "published": "2020-06-30T03:52:32.706291"
    }
  ]
}
"""