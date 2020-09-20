package com.eiknat.lemmyclient.api.post.json

internal const val GET_POST_RESPONSE = """
{
  "post": {
    "id": 42069,
    "name": "i am a test post",
    "url": "https://test.org",
    "body": "",
    "creator_id": 2325,
    "community_id": 3466,
    "removed": false,
    "deleted": false,
    "locked": false,
    "stickied": false,
    "embed_title": "zzzzzzzzzzzzzz",
    "embed_description": "testerino descriptionerino",
    "embed_html": null,
    "thumbnail_url": "https://test.org/pictrs/image/img.jpg",
    "ap_id": "https://test.org/post/42069",
    "local": true,
    "nsfw": false,
    "banned": false,
    "banned_from_community": false,
    "published": "2020-09-10T07:56:16.748175",
    "updated": null,
    "creator_actor_id": "https://test.org/u/testposter5",
    "creator_local": true,
    "creator_name": "testposter5",
    "creator_preferred_username": null,
    "creator_published": "2020-06-07T12:34:31.646688",
    "creator_avatar": null,
    "community_actor_id": "https://test.org/c/testcommunity",
    "community_local": true,
    "community_name": "testcommunity",
    "community_icon": null,
    "community_removed": false,
    "community_deleted": false,
    "community_nsfw": false,
    "number_of_comments": 18,
    "score": 18,
    "upvotes": 18,
    "downvotes": 0,
    "hot_rank": 2,
    "hot_rank_active": 2426,
    "newest_activity_time": "2020-09-14T19:50:44.663545",
    "user_id": null,
    "my_vote": null,
    "subscribed": false,
    "read": false,
    "saved": false,
    "duplicates": []
  },
  "comments": [
    {
      "id": 1295,
      "creator_id": 3441,
      "post_id": 42069,
      "parent_id": 341115,
      "content": "i am content",
      "removed": false,
      "read": false,
      "published": "2020-09-14T19:50:44.663545",
      "updated": null,
      "deleted": false,
      "ap_id": "https://test.org/comment/1295",
      "local": true,
      "community_id": 3466,
      "community_actor_id": "https://test.org/c/testcommunity",
      "community_local": true,
      "community_name": "testcommunity",
      "banned": false,
      "banned_from_community": false,
      "creator_actor_id": "https://test.org/u/testposter10",
      "creator_local": true,
      "creator_name": "testposter10",
      "creator_avatar": null,
      "score": 1,
      "upvotes": 1,
      "downvotes": 0,
      "hot_rank": 1,
      "user_id": null,
      "my_vote": null,
      "subscribed": false,
      "saved": false
    },
    {
      "id": 341115,
      "creator_id": 2325,
      "post_id": 42069,
      "parent_id": 1294,
      "content": "more test content",
      "removed": false,
      "read": true,
      "published": "2020-09-14T17:25:57.576699",
      "updated": "2020-09-14T17:26:44.389241",
      "deleted": false,
      "ap_id": "https://test.org/comment/341115",
      "local": true,
      "community_id": 3466,
      "community_actor_id": "https://test.org/c/testcommunity",
      "community_local": true,
      "community_name": "testcommunity",
      "banned": false,
      "banned_from_community": false,
      "creator_actor_id": "https://test.org/u/testposter5",
      "creator_local": true,
      "creator_name": "testposter5",
      "creator_avatar": null,
      "score": 1,
      "upvotes": 1,
      "downvotes": 0,
      "hot_rank": 1,
      "user_id": null,
      "my_vote": null,
      "subscribed": false,
      "saved": false
    },
    {
      "id": 1294,
      "creator_id": 3441,
      "post_id": 42069,
      "parent_id": 17889,
      "content": "content content content",
      "removed": false,
      "read": true,
      "published": "2020-09-14T15:31:07.548898",
      "updated": null,
      "deleted": false,
      "ap_id": "https://test.org/comment/1294",
      "local": true,
      "community_id": 3466,
      "community_actor_id": "https://test.org/c/testcommunity",
      "community_local": true,
      "community_name": "testcommunity",
      "banned": false,
      "banned_from_community": false,
      "creator_actor_id": "https://test.org/u/testposter10",
      "creator_local": true,
      "creator_name": "testposter10",
      "creator_avatar": null,
      "score": 1,
      "upvotes": 1,
      "downvotes": 0,
      "hot_rank": 1,
      "user_id": null,
      "my_vote": null,
      "subscribed": false,
      "saved": false
    },
    {
      "id": 17889,
      "creator_id": 2325,
      "post_id": 42069,
      "parent_id": 17800,
      "content": "more test content",
      "removed": false,
      "read": true,
      "published": "2020-09-14T15:04:18.147760",
      "updated": "2020-09-14T15:04:59.722194",
      "deleted": false,
      "ap_id": "https://test.org/comment/17889",
      "local": true,
      "community_id": 3466,
      "community_actor_id": "https://test.org/c/testcommunity",
      "community_local": true,
      "community_name": "testcommunity",
      "banned": false,
      "banned_from_community": false,
      "creator_actor_id": "https://test.org/u/testposter5",
      "creator_local": true,
      "creator_name": "testposter5",
      "creator_avatar": null,
      "score": 1,
      "upvotes": 2,
      "downvotes": 1,
      "hot_rank": 1,
      "user_id": null,
      "my_vote": null,
      "subscribed": false,
      "saved": false
    }
  ],
  "community": {
    "id": 4343,
    "actor_id": "https://test.org/c/testcommunity",
    "local": true,
    "name": "testcommunity",
    "title": "Discussion for test community stuff",
    "icon": null,
    "banner": null,
    "description": "test description goes here",
    "category_id": 1,
    "creator_id": 4343,
    "removed": false,
    "deleted": false,
    "nsfw": false,
    "published": "2019-11-15T23:50:53.712299",
    "updated": "2020-07-18T22:31:09.126026",
    "creator_actor_id": "https://test.org/u/testuser1",
    "creator_local": true,
    "last_refreshed_at": "2020-06-30T00:50:29.481479",
    "creator_name": "testuser1",
    "creator_preferred_username": null,
    "creator_avatar": "https://test.org/pictrs/image/img.jpg",
    "category_name": "Discussion",
    "number_of_subscribers": 1167,
    "number_of_posts": 606,
    "number_of_comments": 4211,
    "user_id": null,
    "subscribed": null
  },
  "moderators": [
    {
      "id": 14583,
      "user_id": 442,
      "user_actor_id": "https://test.org/u/testuser1",
      "user_local": true,
      "user_name": "testuser1",
      "user_preferred_username": null,
      "avatar": "https://test.org/pictrs/image/img.jpg",
      "community_id": 3466,
      "community_actor_id": "https://test.org/c/testcommunity",
      "community_local": true,
      "community_name": "testcommunity",
      "community_icon": null,
      "published": "2020-01-07T22:05:05.636350"
    }
  ],
  "online": 1
}
"""