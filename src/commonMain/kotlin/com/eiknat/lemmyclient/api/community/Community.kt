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

    suspend fun create(form: CommunityForm): CommunityResponse {
        return HttpAPI.post(community, form)
    }

    suspend fun edit(form: CommunityForm): CommunityResponse {
        return HttpAPI.put(community, form)
    }

    suspend fun list(form: ListCommunitiesForm): APIResponse<ListCommunitiesResponse> {
        return HttpAPI.get(Endpoint("/community/list"), form.asParams())
    }

    suspend fun transfer(form: TransferCommunityForm): GetCommunityResponse {
        return HttpAPI.post(Endpoint("/community/transfer"), form)
    }

    suspend fun delete(form: DeleteCommunityForm): CommunityResponse {
        return HttpAPI.post(Endpoint("/community/delete"), form)
    }

    suspend fun remove(form: RemoveCommunityForm): CommunityResponse {
        return HttpAPI.post(Endpoint("/community/remove"), form)
    }

    suspend fun follow(form: FollowCommunityForm): CommunityResponse {
        return HttpAPI.post(Endpoint("/community/follow"), form)
    }

    suspend fun banUser(form: BanFromCommunityForm): BanFromCommunityResponse {
        return HttpAPI.post(Endpoint("/community/ban_user"), form)
    }

    suspend fun addMod(form: AddModToCommunityForm): AddModToCommunityResponse {
        return HttpAPI.post(Endpoint("/community/mod"), form)
    }
}
