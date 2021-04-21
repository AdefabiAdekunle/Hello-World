package com.kuntech.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kuntech.helloworldapp.databinding.ActivityMainBinding

private var counter = 0;
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnIncrement.setOnClickListener {
            counter++
            binding.counterView.text= counter.toString()
        }
    }

}