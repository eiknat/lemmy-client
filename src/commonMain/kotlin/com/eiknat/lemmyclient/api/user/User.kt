package com.eiknat.lemmyclient.api.user

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.auth.Auth
import com.eiknat.lemmyclient.api.auth.toParams
import com.eiknat.lemmyclient.api.user.form.*
import com.eiknat.lemmyclient.api.user.response.*
import com.eiknat.lemmyclient.client.HttpAPI
import com.eiknat.lemmyclient.internal.Endpoint

object User {

    suspend fun getCaptcha(): APIResponse<GetCaptchaResponse> {
        return HttpAPI.get(Endpoint("/user/get_captcha"))
    }

    suspend fun register(form: RegisterForm): APIResponse<LoginResponse> {
        return HttpAPI.post(Endpoint("/user/register"), form)
    }

    suspend fun login(form: LoginForm): APIResponse<LoginResponse> {
        return HttpAPI.post(Endpoint("/user/login"), form)
    }

    suspend fun resetPassword(form: PasswordResetForm): APIResponse<PasswordResetResponse> {
        return HttpAPI.post(Endpoint("/user/password_reset"), form)
    }

    suspend fun changePassword(form: PasswordChangeForm): APIResponse<LoginResponse> {
        return HttpAPI.post(Endpoint("/user/password_change"), form)
    }

    suspend fun join(auth: Auth): APIResponse<UserJoinResponse> {
        return HttpAPI.post(Endpoint("/user/join"), auth)
    }

    suspend fun getDetails(form: UserDetailsForm): APIResponse<UserDetailsResponse> {
        return HttpAPI.get(Endpoint("/user"), form.toParams())
    }

    suspend fun getMentions(form: UserMentionsForm): APIResponse<UserMentionsResponse> {
        return HttpAPI.get(Endpoint("/user/mention"), form.toParams())
    }

    suspend fun getReplies(form: GetRepliesForm): APIResponse<GetRepliesResponse> {
        return HttpAPI.get(Endpoint("/user/replies"), form.toParams())
    }

    suspend fun getFollowedCommunities(auth: Auth): APIResponse<GetFollowedCommunitiesResponse> {
        return HttpAPI.get(Endpoint("/user/followed_communities"), auth.toParams())
    }

    suspend fun markMentionAsRead(form: MarkUserMentionAsReadForm): APIResponse<UserMentionResponse> {
        return HttpAPI.post(Endpoint("/user/mention/mark_as_read"), form)
    }

    suspend fun saveSettings(form: UserSettingsForm): LoginResponse {
        return HttpAPI.put(Endpoint("/user/save_user_settings"), form)
    }

    suspend fun deleteAccount(form: DeleteAccountForm): APIResponse<LoginResponse> {
        return HttpAPI.post(Endpoint("/user/delete_account"), form)
    }

    suspend fun ban(form: BanUserForm): APIResponse<BanUserResponse> {
        return HttpAPI.post(Endpoint("/user/ban"), form)
    }
}
