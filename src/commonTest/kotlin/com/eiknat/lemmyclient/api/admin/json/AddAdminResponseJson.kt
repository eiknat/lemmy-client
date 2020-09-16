package com.eiknat.lemmyclient.api.admin.json

internal const val ADD_ADMIN_RESPONSE = """
{
  "admins": [
    {
      "id": 2,
      "actor_id": "https://test.org/u/TestAdmin",
      "name": "TestAdmin",
      "avatar": "https://test.org/pictrs/image/img.jpg",
      "email": "",
      "matrix_user_id": null,
      "bio": null,
      "local": true,
      "admin": true,
      "banned": false,
      "show_avatars": true,
      "send_notifications_to_email": true,
      "published": "2019-08-16T23:13:27.015020",
      "number_of_posts": 1116,
      "post_score": 8262,
      "number_of_comments": 1168,
      "comment_score": 3602
    },
    {
      "id": 4,
      "actor_id": "https://test.org/u/TestAdmin2",
      "name": "TestAdmin2",
      "avatar": null,
      "email": "",
      "matrix_user_id": null,
      "bio": null,
      "local": true,
      "admin": true,
      "banned": false,
      "show_avatars": true,
      "send_notifications_to_email": false,
      "published": "2019-08-17T18:16:54.983870",
      "number_of_posts": 5,
      "post_score": 82,
      "number_of_comments": 7,
      "comment_score": 16
    }
  ]
"""
