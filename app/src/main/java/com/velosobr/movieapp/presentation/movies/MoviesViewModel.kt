package com.velosobr.movieapp.presentation.movies

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.velosobr.movieapp.data.model.Movie

class MoviesViewModel : ViewModel() {

    val moviesLiveData: MutableLiveData<List<Movie>> = MutableLiveData()

    fun getMovies() {
        moviesLiveData.value = getMoviesMocked()
    }

    fun getMoviesMocked(): List<Movie> {
        return listOf(
                Movie("A volta dos que não foram", release_date = "2010", director = "Steve Baulmann"),
                Movie("So Much Love to Give", release_date = "2020", director = "Marcos Carnevale"),
                Movie("Dark Desire ", release_date = "2010", director = "Leticia López Margalli"),
                Movie("Missão Greyhound", release_date = "2020", director = "Aaron Schneider"),
                Movie("La hora de Salvador Romero", release_date = "2017", director = "Gonzalo Gonzalez"),
                Movie("A volta dos que não foram", release_date = "2010", director = "Steve Baulmann"),
                Movie("So Much Love to Give", release_date = "2020", director = "Marcos Carnevale"),
                Movie("Dark Desire ", release_date = "2010", director = "Leticia López Margalli"),
                Movie("Missão Greyhound", release_date = "2020", director = "Aaron Schneider"),
                Movie("La hora de Salvador Romero", release_date = "2017", director = "Gonzalo Gonzalez"),
                Movie("A volta dos que não foram", release_date = "2010", director = "Steve Baulmann"),
                Movie("So Much Love to Give", release_date = "2020", director = "Marcos Carnevale"),
                Movie("Dark Desire ", release_date = "2010", director = "Leticia López Margalli"),
                Movie("Missão Greyhound", release_date = "2020", director = "Aaron Schneider"),
                Movie("La hora de Salvador Romero", release_date = "2017", director = "Gonzalo Gonzalez")

        )
    }
}