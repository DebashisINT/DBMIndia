package com.breezedbmindia.features.newcollectionreport

import com.breezedbmindia.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}