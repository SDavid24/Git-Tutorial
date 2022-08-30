package com.example.gittutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is contained in 2nd commit")


        println("CHANGE 2")

        println("THIS LINE WILL BE MERGED")
    }
}