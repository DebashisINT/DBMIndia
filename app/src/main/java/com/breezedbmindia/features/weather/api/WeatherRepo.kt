package com.breezedbmindia.features.weather.api

import com.breezedbmindia.base.BaseResponse
import com.breezedbmindia.features.task.api.TaskApi
import com.breezedbmindia.features.task.model.AddTaskInputModel
import com.breezedbmindia.features.weather.model.ForeCastAPIResponse
import com.breezedbmindia.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}