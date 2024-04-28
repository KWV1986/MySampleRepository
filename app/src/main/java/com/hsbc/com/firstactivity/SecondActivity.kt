package com.hsbc.com.firstactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val category = intent.getParcelableExtra<Categoty>("category")
         /*runBlocking<Unit> {
             val channel = Channel<Int>(3)

             launch {
                 for(i in 0..5){
                     System.out.println("send $i")
                     channel.send(i)
                 }
             }
             launch {
                 for(x in channel){
                     System.out.println("Received $x")
                 }
             }
         }*/
        val N = 50 // Change this to the desired number
        val result = convertToBaseN(N)
        println("Number $N in all possible bases:")
        println("${result}")
        Log.i("Resut", "111$result")


    }

    fun convertToBaseN(N: Int): String {
        val sb = StringBuilder()

        for (base in 2..36) {
            var number = N
            val digits = StringBuilder()

            while (number > 0) {
                val remainder = number % base
                if (remainder < 10) {
                    digits.append(remainder)
                } else {
                    // For bases greater than 10, represent digits as letters
                    digits.append('A' + remainder - 10)
                }
                number /= base
            }

            val representation = digits.reverse().toString()
            sb.append("$base: $representation\n")
        }

        return sb.toString().trim()
    }
}