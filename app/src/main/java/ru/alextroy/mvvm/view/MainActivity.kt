package ru.alextroy.mvvm.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*
import ru.alextroy.mvvm.R
import ru.alextroy.mvvm.viewmodel.DogViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: DogViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModelsObserve()
        randomListener()
    }

    private fun viewModelsObserve() {
        viewModel.dogBreedLiveData.observe(this, Observer {
            dogbreed_textview.text = it
        })
    }

    private fun randomListener() {
        rand.setOnClickListener {
            viewModel.getRandomDogBreed()
        }
    }
}