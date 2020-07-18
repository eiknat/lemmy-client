package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.APIResult
import com.eiknat.lemmyclient.api.API
import com.eiknat.lemmyclient.api.RequestOp
import com.eiknat.lemmyclient.api.ResponseOp
import com.eiknat.lemmyclient.apipublic.user.RegisterRequest
import com.eiknat.lemmyclient.apipublic.user.RegisterResponse
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


internal object Register : API() {

    suspend fun send(request: RegisterRequest): APIResult<RegisterResponse> {
        val req = RegisterReq(
            RegisterReq.Data(
                username = request.username,
                email = request.email,
                password = request.password,
                password_verify = request.passwordVerification,
                admin = request.admin,
                show_nsfw = request.showNsfw
            )
        )

        return when (val res = performRequest<RegisterRes>(req)) {
            is APIResult.Success -> {
                val response = object : RegisterResponse {
                    override val jwt: String = res.t.data.jwt
                }
                APIResult.Success<RegisterResponse>(response)
            }
            is APIResult.Failure -> {
                APIResult.Failure(res.error)
            }
        }
    }
}

@Serializable
@SerialName("Register")
internal class RegisterReq(val data: Data) : RequestOp() {
    @Serializable
    data class Data(
        val username: String,
        val email: String?,
        val password: String,
        val password_verify: String,
        val admin: Boolean,
        val show_nsfw: Boolean
    )
}

@Serializable
@SerialName("Register")
internal class RegisterRes(val data: Data) : ResponseOp() {
    @Serializable
    data class Data(
        val jwt: String
    )
}
