package com.eiknat.lemmyclient.api.admin

import com.eiknat.lemmyclient.api.admin.form.AddAdminForm
import com.eiknat.lemmyclient.api.admin.response.AddAdminResponse
import com.eiknat.lemmyclient.client.HttpAPI
import com.eiknat.lemmyclient.internal.Endpoint

object Admin {

    suspend fun addAdmin(form: AddAdminForm): AddAdminResponse {
        return HttpAPI.post(Endpoint("/admin/add"), form)
    }
}
