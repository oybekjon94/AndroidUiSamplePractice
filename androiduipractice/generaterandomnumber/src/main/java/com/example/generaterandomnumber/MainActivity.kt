package com.example.generaterandomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.generaterandomnumber.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.generateBtn.setOnClickListener{
            val from = binding.slider.values[0]
            val to  = binding.slider.values[1]

            if (binding.checkbox.isChecked){
                val randomNumber = Random.nextInt(from.toInt(),to.toInt())
                binding.resultTextView.text = "Generate Number : $randomNumber "
            }else{
                val randomNumber = Random.nextDouble(from.toDouble(),to.toDouble())
                binding.resultTextView.text = String.format("Generate Number : %.3f", randomNumber)
            }

        }
    }
}