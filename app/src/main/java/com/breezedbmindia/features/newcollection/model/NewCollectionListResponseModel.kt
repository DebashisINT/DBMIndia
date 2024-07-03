package com.breezedbmindia.features.newcollection.model

import com.breezedbmindia.app.domain.CollectionDetailsEntity
import com.breezedbmindia.base.BaseResponse
import com.breezedbmindia.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}