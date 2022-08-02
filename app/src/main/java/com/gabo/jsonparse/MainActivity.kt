package com.gabo.jsonparse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.gabo.jsonparse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainVM by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupObservers()
    }

    private fun setupObservers() {
        with(viewModel) {
            viewState.observe(this@MainActivity) {
                if (viewState.value?.isSuccessful == true) {
                    binding.tv.text = viewState.value!!.itemData.toString()
                } else {
                    viewState.value?.error?.let {
                        Toast.makeText(
                            this@MainActivity,
                            viewState.value?.error ?: "",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
        }
    }
}
