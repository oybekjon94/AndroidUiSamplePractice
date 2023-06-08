package com.example.calculateapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculateapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.plusBtn.setOnClickListener {
            val firstNum = binding.fristNumberEt.text.toString().toInt()
            val secondNum = binding.secondNumEt.text.toString().toInt()
            binding.result.text = "${firstNum + secondNum}"
        }
        binding.minusBtn.setOnClickListener {
            val firstNum = binding.fristNumberEt.text.toString().toInt()
            val secondNum = binding.secondNumEt.text.toString().toInt()
            binding.result.text = "${firstNum - secondNum}"
        }
        binding.mutplyBtn.setOnClickListener {
            val firstNum = binding.fristNumberEt.text.toString().toInt()
            val secondNum = binding.secondNumEt.text.toString().toInt()
            binding.result.text = "${firstNum * secondNum}"
        }
        binding.divide.setOnClickListener {
            val firstNum = binding.fristNumberEt.text.toString().toDouble()
            val secondNum = binding.secondNumEt.text.toString().toInt()
            binding.result.text = "${firstNum / secondNum}"
        }
    }
}