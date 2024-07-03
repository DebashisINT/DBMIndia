package com.breezedbmindia.features.stockAddCurrentStock.api

import com.breezedbmindia.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezedbmindia.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}