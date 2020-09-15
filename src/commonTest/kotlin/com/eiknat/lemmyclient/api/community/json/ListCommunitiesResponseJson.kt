package com.eiknat.lemmyclient.api.community.json

internal const val LIST_COMMUNITIES_RESPONSE = """
{
  "communities": [
    {
      "id": 123,
      "actor_id": "https://test.org/c/community1234",
      "local": true,
      "name": "community1234",
      "title": "Community12455",
      "icon": null,
      "banner": null,
      "description": null,
      "category_id": 1,
      "creator_id": 55,
      "removed": false,
      "deleted": false,
      "nsfw": false,
      "published": "2020-08-14T06:36:15.338397",
      "updated": "2020-08-14T06:36:24.563171",
      "creator_actor_id": "https://test.org/u/test234",
      "creator_local": true,
      "last_refreshed_at": "2020-08-14T06:36:15.338397",
      "creator_name": "test234",
      "creator_preferred_username": null,
      "creator_avatar": null,
      "category_name": "Discussion",
      "number_of_subscribers": 12,
      "number_of_posts": 2,
      "number_of_comments": 0,
      "user_id": null,
      "subscribed": null
    },
    {
      "id": 25,
      "actor_id": "https://test.org/c/testcommunity",
      "local": true,
      "name": "testcommunity",
      "title": "TestCommunity",
      "icon": null,
      "banner": null,
      "description": "test community description",
      "category_id": 1,
      "creator_id": 34,
      "removed": false,
      "deleted": false,
      "nsfw": false,
      "published": "2020-09-07T07:41:27.949994",
      "updated": "2020-09-07T07:41:37.990976",
      "creator_actor_id": "https://test.org/u/TestUser",
      "creator_local": true,
      "last_refreshed_at": "2020-09-07T07:41:27.949994",
      "creator_name": "TestUser",
      "creator_preferred_username": "Preferred",
      "creator_avatar": "https://test.org/img.jpg",
      "category_name": "Discussion",
      "number_of_subscribers": 2,
      "number_of_posts": 0,
      "number_of_comments": 0,
      "user_id": null,
      "subscribed": null
    }
  ]
}
"""