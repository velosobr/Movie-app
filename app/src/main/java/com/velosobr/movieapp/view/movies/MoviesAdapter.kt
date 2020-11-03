package com.velosobr.movieapp.view.movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.velosobr.movieapp.R
import com.velosobr.movieapp.service.model.Movie

class MoviesAdapter(
    private var movies: List<Movie>,
    val onItemClickListener: ((movie: Movie) -> Unit)
) : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return MoviesViewHolder(view, onItemClickListener)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bindView(movies[position])
    }

    override fun getItemCount() = movies.count()

    fun updateMovies(movies: List<Movie>) {
        this.movies = movies
        notifyDataSetChanged()
    }

    //perguntar sobre o private val onitemclicklistener, duvida de kotlin
    class MoviesViewHolder(
        itemview: View, private val onItemClickListener: ((movie: Movie) -> Unit)
    ) : RecyclerView.ViewHolder(itemview) {

        private val poster: ImageView = itemview.findViewById(R.id.item_movie_poster)

        fun bindView(movie: Movie) {
            itemView.run {
                poster.load("https://image.tmdb.org/t/p/w342${movie.posterPath}") {
                    crossfade(true)
                    transformations(RoundedCornersTransformation(4f))
                }

                itemView.setOnClickListener {
                    onItemClickListener.invoke(movie)
                }
            }
        }
    }

}