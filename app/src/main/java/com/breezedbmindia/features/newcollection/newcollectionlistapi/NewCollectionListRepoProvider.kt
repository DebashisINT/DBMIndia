package com.breezedbmindia.features.newcollection.newcollectionlistapi

/**
 * Created by Saikat on 15-02-2019.
 */
object NewCollectionListRepoProvider {
    fun newCollectionListRepository(): NewCollectionListRepo {
        return NewCollectionListRepo(NewCollectionListApi.create())
    }
}