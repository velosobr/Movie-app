package com.velosobr.movieapp.service.repository

import androidx.lifecycle.MutableLiveData
import com.velosobr.movieapp.service.model.Movie
import com.velosobr.movieapp.service.response.MovieBodyResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieRepositoryImpl : MovieRepository {
    override fun getPopularMovies(page: Int, moviesLiveData: MutableLiveData<List<Movie>>) {
        APIService.SERVICE_API.getPopularMovies(page = page)
            .enqueue(object : Callback<MovieBodyResponse> {

                override fun onResponse(
                    call: Call<MovieBodyResponse>,
                    response: Response<MovieBodyResponse>
                ) {
                    if (response.isSuccessful) {
                        val movies: MutableList<Movie> = mutableListOf()
                        response.body()?.let { MovieBodyResponse ->
                            for (result in MovieBodyResponse.movieResults) {
                                val movie = Movie(
                                    result.title,
                                    result.release_date,
                                    result.overview,
                                    result.poster_path,
                                    result.genre_ids
                                )

                                movies.add(movie)
                            }
                        }
                        moviesLiveData.value = movies
                    }
                }

                override fun onFailure(call: Call<MovieBodyResponse>, t: Throwable) {
                    println("Deu erro" + t.message)
                }
            })
    }
}
