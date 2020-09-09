package com.eiknat.lemmyclient.api.modlog

import com.eiknat.lemmyclient.internal.Endpoint
import com.eiknat.lemmyclient.api.modlog.form.ModlogForm
import com.eiknat.lemmyclient.api.modlog.form.toParams
import com.eiknat.lemmyclient.api.modlog.response.ModLogResponse
import com.eiknat.lemmyclient.client.HttpAPI

object Modlog {

    suspend fun get(form: ModlogForm): ModLogResponse {
        return HttpAPI.get(Endpoint("/modlog"), form.toParams())
    }

}
