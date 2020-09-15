package com.eiknat.lemmyclient.api.site.json

internal const val GET_SITE_RESPONSE = """
{
  "site": {
    "id": 1,
    "name": "testsite",
    "description": "test description",
    "creator_id": 41,
    "published": "2019-04-17T23:34:40.912940",
    "updated": "2019-04-17T23:34:40.912940",
    "creator_name": "testuser455",
    "creator_preferred_username": "testuser455",
    "number_of_users": 5710,
    "number_of_posts": 11472,
    "number_of_comments": 17460,
    "number_of_communities": 1207,
    "enable_downvotes": true,
    "open_registration": true,
    "enable_nsfw": true,
    "icon": "https://test.org/pictrs/image/img.png",
    "banner": null
  },
  "admins": [
    {
      "id": 34,
      "actor_id": "https://test.org/u/testuser455",
      "name": "testuser455",
      "avatar": "https://test.org/pictrs/image/img.jpg",
      "email": "",
      "matrix_user_id": "@test:matrix.org",
      "bio": null,
      "local": true,
      "admin": true,
      "banned": false,
      "show_avatars": true,
      "send_notifications_to_email": false,
      "published": "2019-04-17T23:34:40.912940",
      "number_of_posts": 142,
      "post_score": 1496,
      "number_of_comments": 1277,
      "comment_score": 3940
    }
  ],
  "banned": [
    {
      "id": 8468,
      "actor_id": "https://test.org/u/testuser21",
      "name": "testuser21",
      "avatar": null,
      "email": "",
      "matrix_user_id": null,
      "bio": null,
      "local": true,
      "admin": false,
      "banned": true,
      "show_avatars": true,
      "send_notifications_to_email": false,
      "published": "2020-02-27T10:31:20.346491",
      "number_of_posts": 2,
      "post_score": 1,
      "number_of_comments": 0,
      "comment_score": 0
    }
  ],
  "my_user": {
    "id": 231,
    "name": "testuser1",
    "preferred_user_name": null,
    "email": null,
    "avatar": null,
    "banner": null,
    "admin": false,
    "banned": false,
    "published": "2020-06-30T03:49:06.110008",
    "updated": "2020-09-14T21:50:14.677783",
    "show_nsfw": true,
    "theme": "vaporwave-dark",
    "default_sort_type": 0,
    "default_listing_type": 1,
    "lang": "browser",
    "show_avatars": true,
    "send_notifications_to_email": false,
    "matrix_user_id": null,
    "actor_id": "https://test.org/u/testuser1",
    "bio": null,
    "local": true,
    "last_refreshed_at": "2020-06-30T03:49:06.110008"
  },
  "online": 4,
  "version": "v0.7.57",
  "federated_instances": []
}
"""