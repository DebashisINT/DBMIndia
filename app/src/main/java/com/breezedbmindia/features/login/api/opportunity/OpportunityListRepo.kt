package com.breezedbmindia.features.login.api.opportunity

import com.breezedbmindia.app.Pref
import com.breezedbmindia.app.utils.AppUtils
import com.breezedbmindia.base.BaseResponse
import com.breezedbmindia.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.breezedbmindia.features.login.model.productlistmodel.ProductListResponseModel
import com.breezedbmindia.features.orderITC.SyncDeleteOppt
import com.breezedbmindia.features.orderITC.SyncEditOppt
import com.breezedbmindia.features.orderITC.SyncOppt
import com.breezedbmindia.features.orderList.model.OpportunityListResponseModel
import io.reactivex.Observable
import timber.log.Timber

/**
 * Created by Saikat on 20-11-2018.
 */
class OpportunityListRepo(val apiService: OpportunityListApi) {
    fun getOpportunityStatus(session_token: String): Observable<OpportunityStatusListResponseModel> {
        return apiService.getOpportunityStatusList(session_token)
    }

    fun saveOpportunity(syncOppt: SyncOppt): Observable<BaseResponse> {
        return apiService.saveOpportunity(syncOppt)
    }

    fun editOpportunity(syncEditOppt: SyncEditOppt): Observable<BaseResponse> {
        return apiService.editOpportunity(syncEditOppt)
    }
    fun deleteOpportunity(syncDeleteOppt: SyncDeleteOppt): Observable<BaseResponse> {
        return apiService.deleteOpportunity(syncDeleteOppt)
    }
    fun getOpportunityL(user_id: String): Observable<OpportunityListResponseModel> {
        return apiService.getOpportunityL(user_id)
    }
}