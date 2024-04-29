package com.hsbc.com.firstactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hsbc.com.firstactivity.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}