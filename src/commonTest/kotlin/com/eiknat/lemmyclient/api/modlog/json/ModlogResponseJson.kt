package com.eiknat.lemmyclient.api.modlog.json

internal const val MODLOG_RESPONSE = """
{
  "removed_posts": [
    {
      "id": 23,
      "mod_user_id": 123,
      "post_id": 44,
      "reason": "i am a reason",
      "removed": true,
      "when_": "2020-09-10T14:11:51.773957",
      "mod_user_name": "testModerator",
      "post_name": "hello im a test post",
      "community_id": 334,
      "community_name": "testcomm"
    },
    {
      "id": 343,
      "mod_user_id": 123,
      "post_id": 555,
      "reason": "for reasons",
      "removed": true,
      "when_": "2020-09-10T13:21:51.660995",
      "mod_user_name": "modTestUser",
      "post_name": "test",
      "community_id": 42,
      "community_name": "main"
    }
  ],
  "locked_posts": [
    {
      "id": 344,
      "mod_user_id": 4334,
      "post_id": 341,
      "locked": true,
      "when_": "2020-09-09T05:52:08.012532",
      "mod_user_name": "TESTtestTest",
      "post_name": "zzzz",
      "community_id": 4343,
      "community_name": "testcomm"
    },
    {
      "id": 3434,
      "mod_user_id": 4343,
      "post_id": 4343,
      "locked": false,
      "when_": "2020-09-09T05:51:56.733824",
      "mod_user_name": "TestTEst",
      "post_name": "tada",
      "community_id": 434,
      "community_name": "testcomm"
    }
  ],
  "stickied_posts": [
    {
      "id": 4343,
      "mod_user_id": 4343,
      "post_id": 4343,
      "stickied": true,
      "when_": "2020-09-14T14:31:19.612834",
      "mod_user_name": "imamod",
      "post_name": "ANNOUNCEMENT HERE PLS",
      "community_id": 4444,
      "community_name": "testcomm"
    },
    {
      "id": 4343,
      "mod_user_id": 4343,
      "post_id": 4343,
      "stickied": true,
      "when_": "2020-09-09T05:51:00.852515",
      "mod_user_name": "moduser",
      "post_name": "tesst",
      "community_id": 4343,
      "community_name": "testtt"
    }
  ],
  "removed_comments": [
    {
      "id": 3232,
      "mod_user_id": 3234,
      "comment_id": 4343,
      "reason": "reason text",
      "removed": true,
      "when_": "2020-08-26T11:45:13.766316",
      "mod_user_name": "adminuser",
      "comment_user_id": 4343,
      "comment_user_name": "BadDog",
      "comment_content": "BAD COMMENT",
      "post_id": 4343,
      "post_name": "this is a post",
      "community_id": 4343,
      "community_name": "testerino"
    },
    {
      "id": 69,
      "mod_user_id": 34,
      "comment_id": 15542,
      "reason": null,
      "removed": false,
      "when_": "2020-08-15T11:42:25.568060",
      "mod_user_name": "nice",
      "comment_user_id": 4343,
      "comment_user_name": "not nice",
      "comment_content": "garbage comment",
      "post_id": 6565,
      "post_name": "bad take",
      "community_id": 4343,
      "community_name": "commtest"
    }
  ],
  "removed_communities": [
    {
      "id": 5665,
      "mod_user_id": 5665,
      "community_id": 56565,
      "reason": "bad community",
      "removed": true,
      "expires": null,
      "when_": "2020-09-05T22:54:28.711742",
      "mod_user_name": "modTestUser",
      "community_name": "badcommunity"
    },
    {
      "id": 4343,
      "mod_user_id": 4343,
      "community_id": 4343,
      "reason": null,
      "removed": false,
      "expires": null,
      "when_": "2020-08-21T00:50:57.933038",
      "mod_user_name": "test",
      "community_name": "test"
    }
  ],
  "banned_from_community": [
    {
      "id": 4343,
      "mod_user_id": 4343,
      "other_user_id": 4343,
      "community_id": 4343,
      "reason": null,
      "banned": true,
      "expires": null,
      "when_": "2020-08-30T23:49:55.910634",
      "mod_user_name": "test",
      "other_user_name": "tester",
      "community_name": "zzzzzzzzz"
    },
    {
      "id": 4343,
      "mod_user_id": 3434,
      "other_user_id": 34443,
      "community_id": 4334,
      "reason": null,
      "banned": false,
      "expires": null,
      "when_": "2020-08-30T23:49:16.972987",
      "mod_user_name": "test",
      "other_user_name": "tester",
      "community_name": "434343"
    }
  ],
  "banned": [
    {
      "id": 43243,
      "mod_user_id": 4343,
      "other_user_id": 2332,
      "reason": "test",
      "banned": true,
      "expires": null,
      "when_": "2020-09-12T20:15:11.204479",
      "mod_user_name": "modTestUser",
      "other_user_name": "tester"
    },
    {
      "id": 4343,
      "mod_user_id": 4343,
      "other_user_id": 4343,
      "reason": "Spam",
      "banned": true,
      "expires": null,
      "when_": "2020-09-06T10:19:31.821984",
      "mod_user_name": "testing",
      "other_user_name": "tester"
    }
  ],
  "added_to_community": [
    {
      "id": 110,
      "mod_user_id": 5454,
      "other_user_id": 5554,
      "community_id": 3443,
      "removed": false,
      "when_": "2020-08-21T02:26:11.217921",
      "mod_user_name": "modTestUser",
      "other_user_name": "new",
      "community_name": "test"
    },
    {
      "id": 4343,
      "mod_user_id": 3443,
      "other_user_id": 453,
      "community_id": 4343,
      "removed": false,
      "when_": "2020-08-17T17:02:10.738025",
      "mod_user_name": "tester",
      "other_user_name": "zzzz",
      "community_name": "zzzzzz"
    }
  ],
  "added": [
    {
      "id": 1233,
      "mod_user_id": 5454,
      "other_user_id": 875,
      "removed": false,
      "when_": "2020-07-03T01:19:23.375768",
      "mod_user_name": "modTestUser",
      "other_user_name": "otherUser"
    },
    {
      "id": 45,
      "mod_user_id": 162,
      "other_user_id": 32142,
      "removed": false,
      "when_": "2020-06-30T00:04:34.665983",
      "mod_user_name": "modTestUser",
      "other_user_name": "addedModUser"
    }
  ]
}
"""