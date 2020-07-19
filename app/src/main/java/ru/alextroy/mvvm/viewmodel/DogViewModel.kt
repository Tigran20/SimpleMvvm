package ru.alextroy.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.alextroy.mvvm.repository.DogRepository

class DogViewModel : ViewModel() {

    private val dogRepository = DogRepository()

    private val _dogBreedLiveData = MutableLiveData<String>()
    val dogBreedLiveData: LiveData<String>
        get() = _dogBreedLiveData

    init {
        getRandomDogBreed()
    }

    fun getRandomDogBreed() {
        val dogBreed = dogRepository.getRandomBreed()
        _dogBreedLiveData.postValue(dogBreed)
    }

}