package com.eiknat.lemmyclient.api.modlog

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.modlog.form.ModlogForm
import com.eiknat.lemmyclient.api.modlog.form.toParams
import com.eiknat.lemmyclient.api.modlog.response.ModlogResponse
import com.eiknat.lemmyclient.client.HttpAPI
import com.eiknat.lemmyclient.internal.Endpoint

object Modlog {

    suspend fun get(form: ModlogForm): APIResponse<ModlogResponse> {
        return HttpAPI.get(Endpoint("/modlog"), form.toParams())
    }

}
