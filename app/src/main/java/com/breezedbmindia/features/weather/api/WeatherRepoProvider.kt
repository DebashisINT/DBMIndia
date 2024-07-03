package com.breezedbmindia.features.weather.api

import com.breezedbmindia.features.task.api.TaskApi
import com.breezedbmindia.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}