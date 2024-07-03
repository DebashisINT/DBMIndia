package com.breezedbmindia.features.login.model.opportunitymodel

import com.breezedbmindia.app.domain.OpportunityStatusEntity
import com.breezedbmindia.app.domain.ProductListEntity
import com.breezedbmindia.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}