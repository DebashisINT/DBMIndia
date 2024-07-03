package com.breezedbmindia.features.dashboard.presentation.api.dayStartEnd

import com.breezedbmindia.features.stockCompetetorStock.api.AddCompStockApi
import com.breezedbmindia.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}