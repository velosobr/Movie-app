package com.velosobr.movieapp.data.model

data class Movie(
    val title: String,
    val release_date: String,
    val overview: String,
    val posterPath: String,
    val genIds: List<Int>,
)
