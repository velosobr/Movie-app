package com.velosobr.movieapp.service.repository

import androidx.lifecycle.MutableLiveData
import com.velosobr.movieapp.service.model.Movie

interface MovieRepository {
    fun getPopularMovies(page: Int = 1): MutableLiveData<List<Movie>>
}