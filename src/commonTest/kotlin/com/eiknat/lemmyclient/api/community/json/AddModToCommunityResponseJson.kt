package com.eiknat.lemmyclient.api.community.json

internal const val ADD_MOD_TO_COMMUNITY_RESPONSE = """
{
  "moderators": [
    {
      "id": 176,
      "user_id": 1201,
      "user_actor_id": "https://test.org/u/mod1",
      "user_local": true,
      "user_name": "mod1",
      "user_preferred_username": null,
      "avatar": null,
      "community_id": 145,
      "community_actor_id": "https://test.org/c/testcommunity",
      "community_local": true,
      "community_name": "testcommunity",
      "community_icon": null,
      "published": "2020-09-16T15:29:30.880380"
    },
    {
      "id": 177,
      "user_id": 2,
      "user_actor_id": "https://test.org/u/mod2",
      "user_local": true,
      "user_name": "mod2",
      "user_preferred_username": null,
      "avatar": "https://test.org/pictrs/image/img.jpg",
      "community_id": 145,
      "community_actor_id": "https://test.org/c/testcommunity",
      "community_local": true,
      "community_name": "testcommunity",
      "community_icon": null,
      "published": "2020-09-16T16:23:20.798710"
    }
  ]
}
"""
