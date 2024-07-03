package com.breezedbmindia.features.location.api

import com.breezedbmindia.features.location.shopdurationapi.ShopDurationApi
import com.breezedbmindia.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}