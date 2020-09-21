package com.velosobr.movieapp.presentation.movies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.velosobr.movieapp.R
import com.velosobr.movieapp.data.model.Movie
import kotlinx.android.synthetic.main.activity_movies.*

class MoviesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        toolbarMain.title = getString(R.string.movies_title)

        setSupportActionBar(toolbarMain)

        //with para evitar ficar chamando o recyclerMovies muitas vezes
        with(recyclerMovies) {
            layoutManager = LinearLayoutManager(this@MoviesActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = MoviesAdapter(getMoviesMocked())

        }

    }

    fun getMoviesMocked(): List<Movie> {
        return listOf(
                Movie(title = "A volta dos que não foram", release_date = "2010", director = "Steve Baulmann"),
                Movie(title = "So Much Love to Give", release_date = "2020", director = "Marcos Carnevale"),
                Movie(title = "Dark Desire ", release_date = "2010", director = "Leticia López Margalli"),
                Movie(title = "Missão Greyhound", release_date = "2020", director = "Aaron Schneider"),
                Movie(title = "La hora de Salvador Romero", release_date = "2017", director = "Gonzalo Gonzalez"),
                Movie(title = "A volta dos que não foram", release_date = "2010", director = "Steve Baulmann"),
                Movie(title = "So Much Love to Give", release_date = "2020", director = "Marcos Carnevale"),
                Movie(title = "Dark Desire ", release_date = "2010", director = "Leticia López Margalli"),
                Movie(title = "Missão Greyhound", release_date = "2020", director = "Aaron Schneider"),
                Movie(title = "La hora de Salvador Romero", release_date = "2017", director = "Gonzalo Gonzalez"),
                Movie(title = "A volta dos que não foram", release_date = "2010", director = "Steve Baulmann"),
                Movie(title = "So Much Love to Give", release_date = "2020", director = "Marcos Carnevale"),
                Movie(title = "Dark Desire ", release_date = "2010", director = "Leticia López Margalli"),
                Movie(title = "Missão Greyhound", release_date = "2020", director = "Aaron Schneider"),
                Movie(title = "La hora de Salvador Romero", release_date = "2017", director = "Gonzalo Gonzalez")

        )
    }
}