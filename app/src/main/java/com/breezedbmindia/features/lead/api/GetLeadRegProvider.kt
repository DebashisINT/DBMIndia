package com.breezedbmindia.features.lead.api

import com.breezedbmindia.features.NewQuotation.api.GetQuotListRegRepository
import com.breezedbmindia.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}