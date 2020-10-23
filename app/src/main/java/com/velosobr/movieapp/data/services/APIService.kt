package com.velosobr.movieapp.data.services

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


object

APIService {
    //Singleton quando instanciado como object, assim é instanciado uma vez apenas no app
    private fun initRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    val service: TMDBService = initRetrofit().create(TMDBService::class.java)
}