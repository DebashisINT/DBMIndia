package com.breezedbmindia.features.orderList.model

import com.breezedbmindia.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}