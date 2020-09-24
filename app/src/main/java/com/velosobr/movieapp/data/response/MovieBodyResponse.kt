package com.velosobr.movieapp.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MovieBodyResponse(
    @Json(name = "results")
    val movieResults: List<MovieResultsResponse>
)