package com.eiknat.lemmyclient.api.site

import com.eiknat.lemmyclient.api.APIResponse
import com.eiknat.lemmyclient.api.auth.Auth
import com.eiknat.lemmyclient.api.auth.toParams
import com.eiknat.lemmyclient.api.site.form.SiteConfigForm
import com.eiknat.lemmyclient.api.site.form.SiteForm
import com.eiknat.lemmyclient.api.site.form.TransferSiteForm
import com.eiknat.lemmyclient.api.site.response.GetSiteConfigResponse
import com.eiknat.lemmyclient.api.site.response.GetSiteResponse
import com.eiknat.lemmyclient.api.site.response.SiteResponse
import com.eiknat.lemmyclient.client.HttpAPI
import com.eiknat.lemmyclient.internal.Endpoint


object Site {
    private val site = Endpoint("/site")
    private val siteTransfer = Endpoint("/site/transfer")
    private val siteConfig = Endpoint("/site/config")

    suspend fun get(auth: Auth): APIResponse<GetSiteResponse> {
        return HttpAPI.get(site, auth.toParams())
    }

    suspend fun create(form: SiteForm): APIResponse<SiteResponse> {
        return HttpAPI.post(site, form)
    }

    suspend fun edit(form: SiteForm): APIResponse<SiteResponse> {
        return HttpAPI.put(site, form)
    }

    suspend fun transfer(form: TransferSiteForm): APIResponse<GetSiteResponse> {
        return HttpAPI.post(siteTransfer, form)
    }

    suspend fun getConfig(auth: Auth): APIResponse<GetSiteConfigResponse> {
        return HttpAPI.get(siteConfig, auth.toParams())
    }

    suspend fun editConfig(form: SiteConfigForm): APIResponse<GetSiteConfigResponse> {
        return HttpAPI.put(siteConfig, form)
    }
}
