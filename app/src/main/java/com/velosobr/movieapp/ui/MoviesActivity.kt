package com.velosobr.movieapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.velosobr.movieapp.R
import kotlinx.android.synthetic.main.activity_movies.*

class MoviesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        toolbarMain.title = "Movies"

        setSupportActionBar(toolbarMain)
        
    }
}