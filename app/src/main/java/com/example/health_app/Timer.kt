package com.example.health_app

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import com.example.health_app.databinding.ActivityMainBinding
import com.example.health_app.databinding.ActivityTimerBinding

class Timer : AppCompatActivity() {

    var initTime = 0L
    var pauseTime = 0L
    lateinit var startButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =ActivityTimerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startButton=findViewById(R.id.startButton)

        binding.startButton.setOnClickListener {
            binding.chronometer.base = SystemClock.elapsedRealtime() + pauseTime
            binding.chronometer.start()
            binding.startButton.isEnabled = false
            binding.stopButton.isEnabled = true
            binding.resetButton.isEnabled = true

            binding.runImage.isVisible =true
            binding.stopImage.isVisible =false
            binding.watchImage.isVisible =false
        }

        binding.stopButton.setOnClickListener {
            pauseTime = binding.chronometer.base - SystemClock.elapsedRealtime()
            binding.chronometer.stop()
            binding.startButton.isEnabled = true
            binding.stopButton.isEnabled = false
            binding.resetButton.isEnabled = true

            binding.runImage.isVisible = false
            binding.stopImage.isVisible = true
            binding.watchImage.isVisible = false
        }

        binding.resetButton.setOnClickListener {
            pauseTime = 0L
            binding.chronometer.base = SystemClock.elapsedRealtime()
            binding.chronometer.stop()
            binding.startButton.isEnabled = true
            binding.stopButton.isEnabled = false
            binding.resetButton.isEnabled = false

            binding.runImage.isVisible = false
            binding.stopImage.isVisible = false
            binding.watchImage.isVisible = true
        }
    }
}