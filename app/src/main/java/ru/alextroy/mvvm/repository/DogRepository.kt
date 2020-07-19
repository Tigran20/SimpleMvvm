package ru.alextroy.mvvm.repository

import ru.alextroy.mvvm.model.Dog

class DogRepository {

    private val dogModel = Dog()

    fun getRandomBreed(): String = dogModel.getRandomBreed()
}