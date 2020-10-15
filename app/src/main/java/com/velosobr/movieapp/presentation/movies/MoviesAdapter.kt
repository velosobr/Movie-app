 package com.velosobr.movieapp.presentation.movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.velosobr.movieapp.R
import com.velosobr.movieapp.data.model.Movie
import kotlinx.android.synthetic.main.item_movie.view.*

class MoviesAdapter(
        private val movies: List<Movie>
) : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MoviesViewHolder(view)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bindView(movies[position])
    }

    override fun getItemCount() = movies.count()

    class MoviesViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        val title = itemview.movie_title
        val releaseDate = itemview.release_date
        val genIds = itemview.genero

        fun bindView(movie: Movie) {
            itemView.run {
                title.text = movie.title
                releaseDate.text = movie.release_date.take(4)
                genIds.text = movie.genIds.toString()
            }
        }
    }

}