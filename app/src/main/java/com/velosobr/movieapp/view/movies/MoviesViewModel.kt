package com.velosobr.movieapp.view.movies

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.velosobr.movieapp.service.model.Movie
import com.velosobr.movieapp.service.repository.APIService
import com.velosobr.movieapp.service.response.MovieBodyResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoviesViewModel : ViewModel() {

    val moviesLiveData: MutableLiveData<List<Movie>> = MutableLiveData()

    fun getPopularMovies(page: Int = 1) {
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
                                val movie = result.poster_path?.let {
                                    Movie(
                                        result.title,
                                        result.release_date,
                                        result.overview,
                                        it,
                                        result.genre_ids


                                    )
                                }
                                movies.add(movie!!)
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

//    fun getMoviesMocked(): List<Movie> {
//        return listOf(
//            Movie("A volta dos que não foram", release_date = "2010"),
//            Movie("So Much Love to Give", release_date = "2020"),
//            Movie("Dark Desire ", release_date = "2010"),
//                Movie("Missão Greyhound", release_date = "2020", director = "Aaron Schneider"),
//                Movie("La hora de Salvador Romero", release_date = "2017", director = "Gonzalo Gonzalez"),
//                Movie("A volta dos que não foram", release_date = "2010", director = "Steve Baulmann"),
//                Movie("So Much Love to Give", release_date = "2020", director = "Marcos Carnevale"),
//                Movie("Dark Desire ", release_date = "2010", director = "Leticia López Margalli"),
//                Movie("Missão Greyhound", release_date = "2020", director = "Aaron Schneider"),
//                Movie("La hora de Salvador Romero", release_date = "2017", director = "Gonzalo Gonzalez"),
//                Movie("A volta dos que não foram", release_date = "2010", director = "Steve Baulmann"),
//                Movie("So Much Love to Give", release_date = "2020", director = "Marcos Carnevale"),
//                Movie("Dark Desire ", release_date = "2010", director = "Leticia López Margalli"),
//                Movie("Missão Greyhound", release_date = "2020", director = "Aaron Schneider"),
//                Movie("La hora de Salvador Romero", release_date = "2017", director = "Gonzalo Gonzalez")

//        )
//    }
}