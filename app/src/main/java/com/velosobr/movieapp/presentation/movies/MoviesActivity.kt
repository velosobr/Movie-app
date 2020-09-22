package com.velosobr.movieapp.presentation.movies

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.velosobr.movieapp.R
import kotlinx.android.synthetic.main.activity_movies.*

class MoviesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        toolbarMain.title = getString(R.string.movies_title)

        setSupportActionBar(toolbarMain)


        val viewmodel: MoviesViewModel by viewModels()
        viewmodel.moviesLiveData.observe(this, Observer {
            it?.let { movies ->
                //with para evitar ficar chamando o recyclerMovies muitas vezes
                with(recyclerMovies) {
                    layoutManager = LinearLayoutManager(this@MoviesActivity, RecyclerView.VERTICAL, false)
                    setHasFixedSize(true)
                    adapter = MoviesAdapter(movies)

                }
            }
        })
        viewmodel.getMovies()


    }


}