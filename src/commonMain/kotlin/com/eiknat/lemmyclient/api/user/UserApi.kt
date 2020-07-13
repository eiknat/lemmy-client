package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import kotlinx.coroutines.Deferred

expect object UserApi {

    suspend fun performRequestAsync(op: RequestOp, handler: (String?) -> ResponseOp): Deferred<Unit>

    suspend fun sendUserRequest(request: RegisterRequest)
}

