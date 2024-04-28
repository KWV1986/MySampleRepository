package com.hsbc.com.firstactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val category = Categoty(10,"manufacturing")

        val intent = Intent(this@MainActivity,SecondActivity::class.java)
        intent.putExtra("category",category)
        startActivity(intent)

    }
}