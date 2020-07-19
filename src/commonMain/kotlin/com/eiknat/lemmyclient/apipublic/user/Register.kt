package com.eiknat.lemmyclient.apipublic.user


interface RegisterRequest {
    val username: String
    val email: String?
    val password: String
    val passwordVerification: String
    val admin: Boolean
    val showNsfw: Boolean
}

interface RegisterResponse {
    val jwt: String
}
