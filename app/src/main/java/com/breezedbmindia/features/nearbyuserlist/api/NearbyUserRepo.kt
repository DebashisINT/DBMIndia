package com.breezedbmindia.features.nearbyuserlist.api

import com.breezedbmindia.app.Pref
import com.breezedbmindia.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezedbmindia.features.newcollection.model.NewCollectionListResponseModel
import com.breezedbmindia.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}