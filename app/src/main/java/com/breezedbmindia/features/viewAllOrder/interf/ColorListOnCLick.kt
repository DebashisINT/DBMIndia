package com.breezedbmindia.features.viewAllOrder.interf

import com.breezedbmindia.app.domain.NewOrderGenderEntity
import com.breezedbmindia.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}