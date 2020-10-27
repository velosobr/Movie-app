package com.velosobr.movieapp.presentation.movies

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.velosobr.movieapp.R
import com.velosobr.movieapp.presentation.details.MovieDetailsActivity
import kotlinx.android.synthetic.main.activity_movies.*

class MoviesActivity : AppCompatActivity() {
    private val viewModel: MoviesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        viewModel.moviesLiveData.observe(this, Observer {
            it?.let { movies ->
                //with para evitar ficar chamando o recyclerMovies muitas vezes
                with(recycler_popular_movies) {
                    layoutManager =
                        LinearLayoutManager(this@MoviesActivity, RecyclerView.HORIZONTAL, false)
                    setHasFixedSize(true)
                    adapter =
                        MoviesAdapter(movies) { movie ->//se o lambda é o ultimo param, pode fechar os parenteses
                            val intent =
                                MovieDetailsActivity.getStartIntent(this@MoviesActivity, movie)
                            this@MoviesActivity.startActivity(intent)

                        }
                }
            }
        })
        viewModel.getPopularMovies()


    }


}