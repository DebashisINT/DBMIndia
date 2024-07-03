package com.breezedbmindia.features.survey.api

import com.breezedbmindia.features.photoReg.api.GetUserListPhotoRegApi
import com.breezedbmindia.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}