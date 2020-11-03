package com.velosobr.movieapp.view.movies

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.velosobr.movieapp.service.model.Movie
import com.velosobr.movieapp.service.repository.MovieRepository

class MoviesViewModel(private val movieRepository: MovieRepository) : ViewModel() {

    var moviesLiveData: MutableLiveData<List<Movie>> = MutableLiveData()

    fun getPopularMovies() {
        movieRepository.getPopularMovies(1, moviesLiveData)
    }
}