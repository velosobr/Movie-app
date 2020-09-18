package com.velosobr.movieapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.velosobr.movieapp.R
import kotlinx.android.synthetic.main.activity_movies.*

class MoviesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        toolbarMain.title = getString(R.string.movies_title)

        setSupportActionBar(toolbarMain)
        
    }
}