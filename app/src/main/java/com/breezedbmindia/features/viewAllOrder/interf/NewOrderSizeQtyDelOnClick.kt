package com.breezedbmindia.features.viewAllOrder.interf

import com.breezedbmindia.app.domain.NewOrderGenderEntity
import com.breezedbmindia.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}