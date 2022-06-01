package com.example.aula2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("life cicle: onCreate")

        Toast.makeText(this, R.string.Welcome_Message, Toast.LENGTH_SHORT).show()
    }

    val btn = findViewById<Button>(R.id.btn1)


        val intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)


}