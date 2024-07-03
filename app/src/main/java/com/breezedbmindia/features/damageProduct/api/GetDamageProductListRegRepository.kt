package com.breezedbmindia.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezedbmindia.app.FileUtils
import com.breezedbmindia.base.BaseResponse
import com.breezedbmindia.features.NewQuotation.model.*
import com.breezedbmindia.features.addshop.model.AddShopRequestData
import com.breezedbmindia.features.addshop.model.AddShopResponse
import com.breezedbmindia.features.damageProduct.model.DamageProductResponseModel
import com.breezedbmindia.features.damageProduct.model.delBreakageReq
import com.breezedbmindia.features.damageProduct.model.viewAllBreakageReq
import com.breezedbmindia.features.login.model.userconfig.UserConfigResponseModel
import com.breezedbmindia.features.myjobs.model.WIPImageSubmit
import com.breezedbmindia.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}