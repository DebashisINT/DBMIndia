package com.breezedbmindia.features.viewAllOrder.interf

import com.breezedbmindia.app.domain.NewOrderGenderEntity
import com.breezedbmindia.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}