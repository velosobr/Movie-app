package com.velosobr.movieapp.data.services

import com.velosobr.movieapp.data.response.MovieBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("/movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "SUA CHAVE AQUI"
    ): Call<MovieBodyResponse>
}