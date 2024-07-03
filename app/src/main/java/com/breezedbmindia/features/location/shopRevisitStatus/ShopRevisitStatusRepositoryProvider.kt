package com.breezedbmindia.features.location.shopRevisitStatus

import com.breezedbmindia.features.location.shopdurationapi.ShopDurationApi
import com.breezedbmindia.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}