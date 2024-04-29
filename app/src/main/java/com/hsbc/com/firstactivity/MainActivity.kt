package com.hsbc.com.firstactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hsbc.com.firstactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val category = Categoty(10,"manufacturing")
        val result= reverseString("deepak borade")
        Log.i("Main", result)
        val isvalid = validateUser("Deepak")
        paymentGateWay()
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
    fun paymentGateWay(){
     binding.textView.setText("Payment Gateway is added")
        Log.i(TAG,"New log message is added")

    }

    fun validateUser(user:String):Boolean{
        return user.equals("deepak",ignoreCase = false)
    }


}