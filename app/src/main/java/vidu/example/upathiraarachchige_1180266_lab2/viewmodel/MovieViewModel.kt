package vidu.example.upathiraarachchige_1180266_lab2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import vidu.example.upathiraarachchige_1180266_lab2.model.Movie

class MovieViewModel : ViewModel() {
private val _movies = MutableLiveData<MutableList<Movie>>(mutableListOf())
val movies: LiveData<MutableList<Movie>> get() = _movies

    private val _dataUpdated = MutableLiveData<Boolean>()
    val dataUpdated: LiveData<Boolean> get() = _dataUpdated

    fun addMovie(movie: Movie) {
        _movies.value?.add(movie)
        _movies.value = _movies.value
        _dataUpdated.value = !(_dataUpdated.value ?: false)
    }
}