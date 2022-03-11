package com.example.aula2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("life cicle: onCreate")

        Toast.makeText(this, R.string.Welcome_Message, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        println("life cicle: onStart")
    }

    override fun onPause() {
        super.onPause()
        println("life cicle: onPause")
    }

    override fun onStop() {
        super.onStop()
        println("life cicle: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("life cicle: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        println("life cicle: onRestart")
    }
}