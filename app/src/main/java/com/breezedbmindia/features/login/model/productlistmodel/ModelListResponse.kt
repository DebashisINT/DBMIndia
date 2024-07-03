package com.breezedbmindia.features.login.model.productlistmodel

import com.breezedbmindia.app.domain.ModelEntity
import com.breezedbmindia.app.domain.ProductListEntity
import com.breezedbmindia.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}