package com.breezedbmindia.features.viewAllOrder.interf

import com.breezedbmindia.app.domain.NewOrderColorEntity
import com.breezedbmindia.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}