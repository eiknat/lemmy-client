package com.eiknat.lemmyclient.api.community

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.community.form.*
import com.eiknat.lemmyclient.api.community.response.*
import com.eiknat.lemmyclient.client.HttpAPI
import com.eiknat.lemmyclient.internal.Endpoint

object Community {
    private val community = Endpoint("/community")

    suspend fun get(form: GetCommunityForm): APIResponse<GetCommunityResponse> {
        return HttpAPI.get(community, form.asParams())
    }

    suspend fun create(form: CreateCommunityForm): APIResponse<CommunityResponse> {
        return HttpAPI.post(community, form)
    }

    suspend fun edit(form: EditCommunityForm): CommunityResponse {
        return HttpAPI.put(community, form)
    }

    suspend fun list(form: ListCommunitiesForm): APIResponse<ListCommunitiesResponse> {
        return HttpAPI.get(Endpoint("/community/list"), form.asParams())
    }

    suspend fun transfer(form: TransferCommunityForm): APIResponse<GetCommunityResponse> {
        return HttpAPI.post(Endpoint("/community/transfer"), form)
    }

    suspend fun delete(form: DeleteCommunityForm): APIResponse<CommunityResponse> {
        return HttpAPI.post(Endpoint("/community/delete"), form)
    }

    suspend fun remove(form: RemoveCommunityForm): APIResponse<CommunityResponse> {
        return HttpAPI.post(Endpoint("/community/remove"), form)
    }

    suspend fun follow(form: FollowCommunityForm): APIResponse<CommunityResponse> {
        return HttpAPI.post(Endpoint("/community/follow"), form)
    }

    suspend fun banUser(form: BanFromCommunityForm): APIResponse<BanFromCommunityResponse> {
        return HttpAPI.post(Endpoint("/community/ban_user"), form)
    }

    suspend fun addMod(form: AddModToCommunityForm): APIResponse<AddModToCommunityResponse> {
        return HttpAPI.post(Endpoint("/community/mod"), form)
    }
}
