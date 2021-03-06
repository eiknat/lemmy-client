package com.eiknat.lemmyclient.api.category

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.category.response.ListCategoriesResponse
import com.eiknat.lemmyclient.client.HttpAPI
import com.eiknat.lemmyclient.internal.Endpoint

object Category {

    suspend fun list(): APIResponse<ListCategoriesResponse> {
        return HttpAPI.get(Endpoint("/categories"), emptyMap())
    }
}
