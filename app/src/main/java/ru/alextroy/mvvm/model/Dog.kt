package ru.alextroy.mvvm.model

class Dog {

    private val breeds = listOf(
        "German Shepherd",
        "Bulldog",
        "Poodle",
        "Labrador Retriever",
        "Golden Retriever",
        "Beagle",
        "Yorkshire Terrier",
        "Dachshund",
        "Chihuahua"
    )

    fun getRandomBreed(): String {
        return breeds.random()
    }
}