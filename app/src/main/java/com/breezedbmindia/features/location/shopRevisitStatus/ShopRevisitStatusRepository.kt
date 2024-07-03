package com.breezedbmindia.features.location.shopRevisitStatus

import com.breezedbmindia.base.BaseResponse
import com.breezedbmindia.features.location.model.ShopDurationRequest
import com.breezedbmindia.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}