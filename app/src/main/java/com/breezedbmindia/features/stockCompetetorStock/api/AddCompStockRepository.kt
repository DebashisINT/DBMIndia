package com.breezedbmindia.features.stockCompetetorStock.api

import com.breezedbmindia.base.BaseResponse
import com.breezedbmindia.features.orderList.model.NewOrderListResponseModel
import com.breezedbmindia.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezedbmindia.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}