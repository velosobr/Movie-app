package com.velosobr.movieapp.data.services

import com.velosobr.movieapp.data.LocalData
import com.velosobr.movieapp.data.response.MovieBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("/3/movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = LocalData().API_KEY
    ): Call<MovieBodyResponse>

    @GET("/3/3/movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = LocalData().API_KEY
    ): Call<MovieBodyResponse>

    @GET("/3/movie/{movie_id}/videos")
    fun getTraillersFromMovies(
        @Query("api_key") apiKey: String = LocalData().API_KEY
    ): Call<MovieBodyResponse>

    @GET("/3/movie/{movie_id}")
    fun detailsAboutMovie(
        @Query("api_key") apiKey: String = LocalData().API_KEY
    ): Call<MovieBodyResponse>
}