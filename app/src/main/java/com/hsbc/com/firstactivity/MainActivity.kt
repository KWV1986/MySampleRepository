package com.hsbc.com.firstactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val category = Categoty(10,"manufacturing")
        val result= reverseString("deepak borade")
        Log.i("Main", result)
        val intent = Intent(this@MainActivity,SecondActivity::class.java)
        intent.putExtra("category",category)
        startActivity(intent)

    }
    private fun reverseString(name: String): String {
        var word = ""
        var result = ""
        for (char in name) {
            if (char != ' ') {
                word = char + word
            } else {
                result += word + ""
                word = ""
            }
        }
        result += word
        return result
    }

}