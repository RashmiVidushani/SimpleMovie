package vidu.example.upathiraarachchige_1180266_lab2.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import vidu.example.upathiraarachchige_1180266_lab2.databinding.ItemMovieBinding
import vidu.example.upathiraarachchige_1180266_lab2.model.Movie

class MovieAdapter(private var movies : List<Movie>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

        class MovieViewHolder(private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root){
                fun bind(movie: Movie){
                    binding.movieName.text = movie.name
                    binding.movieGenre.text = movie.genre
                }
    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
            val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return MovieViewHolder(binding)
        }

    override fun getItemCount() = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movies[position])
    }
    fun updateMovies(newMovies: List<Movie>) {
        this.movies = newMovies
        notifyDataSetChanged()
    }
}