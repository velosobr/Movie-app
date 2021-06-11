package com.velosobr.movieapp.view.movies

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.velosobr.movieapp.service.repository.MovieRepositoryImpl

class MoviesViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(p0: Class<T>): T {
        return MoviesViewModel(MovieRepositoryImpl()) as T
    }
}
