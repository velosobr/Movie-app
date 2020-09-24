package com.velosobr.movieapp.presentation.movies

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.velosobr.movieapp.R
import kotlinx.android.synthetic.main.activity_movies.*

class MoviesActivity : AppCompatActivity() {
    private val viewModel: MoviesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        toolbarMain.title = getString(R.string.movies_title)

        setSupportActionBar(toolbarMain)

        viewModel.moviesLiveData.observe(this, Observer {
            it?.let { movies ->
                Log.i("movies", "movies")
                //with para evitar ficar chamando o recyclerMovies muitas vezes
                with(recyclerMovies) {
                    layoutManager =
                        LinearLayoutManager(this@MoviesActivity, RecyclerView.VERTICAL, false)
                    setHasFixedSize(true)
                    adapter = MoviesAdapter(movies)
                }
            }
        })


    }


}