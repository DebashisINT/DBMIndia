package com.breezedbmindia.features.viewAllOrder.model

import com.breezedbmindia.app.domain.NewOrderColorEntity
import com.breezedbmindia.app.domain.NewOrderGenderEntity
import com.breezedbmindia.app.domain.NewOrderProductEntity
import com.breezedbmindia.app.domain.NewOrderSizeEntity
import com.breezedbmindia.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

