package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.APIResult

expect object UserAPI {

    suspend fun sendUserJoin(request: UserJoinRequest): APIResult<UserJoinResponse>

}

