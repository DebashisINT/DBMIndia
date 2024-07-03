package com.breezedbmindia.features.location.shopRevisitStatus

import com.breezedbmindia.app.NetworkConstant
import com.breezedbmindia.base.BaseResponse
import com.breezedbmindia.features.location.model.ShopDurationRequest
import com.breezedbmindia.features.location.model.ShopRevisitStatusRequest
import com.breezedbmindia.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

interface ShopRevisitStatusApi {

    @POST("Shopsubmission/OrderNotTakenReason")
    fun submShopRevisitStatus(@Body shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse>

    companion object Factory {
        fun create(): ShopRevisitStatusApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(ShopRevisitStatusApi::class.java)
        }
    }

}