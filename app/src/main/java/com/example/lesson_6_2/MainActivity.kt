package com.example.lesson_6_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson_6_2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val data = arrayListOf<String>()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
        onClick()

    }

    private fun onClick() {
        with(binding) {
            btnText.setOnClickListener {
                text.text = data.toString()
            }
        }
    }

    private fun initClicker() {
        with(binding) {
            btnAdd.setOnClickListener {
                data.add(editText.text.toString())
            }
        }
    }
}