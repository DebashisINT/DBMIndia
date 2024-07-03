package com.breezedbmindia.features.photoReg.present

import com.breezedbmindia.app.domain.ProspectEntity
import com.breezedbmindia.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}