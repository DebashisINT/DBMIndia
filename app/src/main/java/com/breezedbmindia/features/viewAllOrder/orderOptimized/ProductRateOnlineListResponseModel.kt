package com.breezedbmindia.features.viewAllOrder.orderOptimized

import com.breezedbmindia.app.domain.ProductOnlineRateTempEntity
import com.breezedbmindia.base.BaseResponse
import com.breezedbmindia.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}