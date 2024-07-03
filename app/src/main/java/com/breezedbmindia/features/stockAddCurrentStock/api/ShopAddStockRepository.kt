package com.breezedbmindia.features.stockAddCurrentStock.api

import com.breezedbmindia.base.BaseResponse
import com.breezedbmindia.features.location.model.ShopRevisitStatusRequest
import com.breezedbmindia.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezedbmindia.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezedbmindia.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezedbmindia.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}