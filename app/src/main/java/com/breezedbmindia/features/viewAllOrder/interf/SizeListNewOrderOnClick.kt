package com.breezedbmindia.features.viewAllOrder.interf

import com.breezedbmindia.app.domain.NewOrderProductEntity
import com.breezedbmindia.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}