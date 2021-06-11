package com.velosobr.movieapp.view.movieDetails

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.velosobr.movieapp.R
import com.velosobr.movieapp.service.model.Movie
import kotlinx.android.synthetic.main.activity_details.*

class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        movie_title_descriptionView.text = intent.getStringExtra(MOVIE_TITLE)
        description_text.text = intent.getStringExtra(DESCRIPTION_TEXT)
    }

    companion object {
        // Colocando a construção da intent, dentro da activity_details para simplificar e deixar as informações mais fechadas.
        private const val MOVIE_TITLE = "MOVIE_TITLE"
        private const val DESCRIPTION_TEXT = "DESCRIPTION_TEXT"

        fun getStartIntent(context: Context, movie: Movie): Intent {
            return Intent(context, MovieDetailsActivity::class.java).apply {
                putExtra("MOVIE_TITLE", movie.title)
                putExtra("DESCRIPTION_TEXT", movie.overview)
            }
        }
    }
}
