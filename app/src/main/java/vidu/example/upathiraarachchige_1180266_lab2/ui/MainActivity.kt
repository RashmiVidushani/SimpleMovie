package vidu.example.upathiraarachchige_1180266_lab2.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import vidu.example.upathiraarachchige_1180266_lab2.viewmodel.MovieViewModel
import vidu.example.upathiraarachchige_1180266_lab2.databinding.ActivityMainBinding
import vidu.example.upathiraarachchige_1180266_lab2.model.Movie

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val moveViewModel : MovieViewModel by viewModels()
    private lateinit var adapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = MovieAdapter(listOf())
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        moveViewModel.movies.observe(this) { movies ->
            adapter.updateMovies(movies)
        }

        moveViewModel.dataUpdated.observe(this) {
            adapter.updateMovies(moveViewModel.movies.value ?: listOf())
        }

        binding.btnSave.setOnClickListener {
            val movieName = "Movie -  " + binding.etMovieName.text.toString()
            val movieGenre = "Genre - " + binding.etMovieGenre.text.toString()
            val movie = Movie(movieName, movieGenre)
            moveViewModel.addMovie(movie)
            binding.etMovieName.text?.clear()
            binding.etMovieGenre.text?.clear()
        }


    }



}