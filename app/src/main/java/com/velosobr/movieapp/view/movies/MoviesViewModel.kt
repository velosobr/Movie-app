package com.velosobr.movieapp.view.movies

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.velosobr.movieapp.service.model.Movie
import com.velosobr.movieapp.service.repository.MovieRepositoryImpl

class MoviesViewModel : ViewModel() {

    val moviesLiveData: MutableLiveData<List<Movie>> = MovieRepositoryImpl()

}