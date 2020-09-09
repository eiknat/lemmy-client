package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.auth.Auth
import com.eiknat.lemmyclient.api.auth.toParams
import com.eiknat.lemmyclient.internal.Endpoint
import com.eiknat.lemmyclient.api.user.form.*
import com.eiknat.lemmyclient.api.user.response.*
import com.eiknat.lemmyclient.client.HttpAPI

object User {

    suspend fun getCaptcha(): GetCaptchaResponse {
        return HttpAPI.get(Endpoint("/user/get_captcha"), emptyMap())
    }

    suspend fun register(form: RegisterForm): LoginResponse {
        return HttpAPI.post(Endpoint("/user/register"), form)
    }

    suspend fun login(form: LoginForm): LoginResponse {
        return HttpAPI.post(Endpoint("/user/login"), form)
    }

    suspend fun resetPassword(form: PasswordResetForm): PasswordResetResponse {
        return HttpAPI.post(Endpoint("/user/password_reset"), form)
    }

    suspend fun changePassword(form: PasswordChangeForm): LoginResponse {
        return HttpAPI.post(Endpoint("/user/password_change"), form)
    }

    suspend fun join(auth: Auth): UserJoinResponse {
        return HttpAPI.post(Endpoint("/user/join"), auth)
    }

    suspend fun getDetails(form: UserDetailsForm): UserDetailsResponse {
        return HttpAPI.get(Endpoint("/user"), form.toParams())
    }

    suspend fun getMentions(form: UserMentionsForm): UserMentionsResponse {
        return HttpAPI.get(Endpoint("/user/mention"), form.toParams())
    }

    suspend fun getReplies(form: GetRepliesForm): GetRepliesResponse {
        return HttpAPI.get(Endpoint("/user/replies"), form.toParams())
    }

    suspend fun getFollowedCommunities(auth: Auth): GetFollowedCommunitiesResponse {
        return HttpAPI.get(Endpoint("/user/followed_communities"), auth.toParams())
    }

    suspend fun markMentionsAsRead(form: MarkUserMentionAsReadForm): UserMentionResponse {
        return HttpAPI.post(Endpoint("/user/mention/mark_as_read"), form)
    }

    suspend fun saveSettings(form: UserSettingsForm): LoginResponse {
        return HttpAPI.put(Endpoint("/user/save_user_settings"), form)
    }

    suspend fun deleteAccount(form: DeleteAccountForm): LoginResponse {
        return HttpAPI.post(Endpoint("/user/delete_account"), form)
    }

    suspend fun ban(form: BanUserForm): BanUserResponse {
        return HttpAPI.post(Endpoint("/user/ban"), form)
    }
}
