package com.breezedbmindia.features.document.api

import com.breezedbmindia.features.dymanicSection.api.DynamicApi
import com.breezedbmindia.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}