package com.breezedbmindia.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezedbmindia.app.FileUtils
import com.breezedbmindia.app.Pref
import com.breezedbmindia.base.BaseResponse
import com.breezedbmindia.features.addshop.model.AddLogReqData
import com.breezedbmindia.features.addshop.model.AddShopRequestData
import com.breezedbmindia.features.addshop.model.AddShopResponse
import com.breezedbmindia.features.addshop.model.LogFileResponse
import com.breezedbmindia.features.addshop.model.UpdateAddrReq
import com.breezedbmindia.features.contacts.CallHisDtls
import com.breezedbmindia.features.contacts.CompanyReqData
import com.breezedbmindia.features.contacts.ContactMasterRes
import com.breezedbmindia.features.contacts.SourceMasterRes
import com.breezedbmindia.features.contacts.StageMasterRes
import com.breezedbmindia.features.contacts.StatusMasterRes
import com.breezedbmindia.features.contacts.TypeMasterRes
import com.breezedbmindia.features.dashboard.presentation.DashboardActivity
import com.breezedbmindia.features.login.model.WhatsappApiData
import com.breezedbmindia.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}