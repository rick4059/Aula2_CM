package com.example.aula2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val PARAM1_NAME = "NOME"

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

    fun butao(view: View) {
        var editText = findViewById<EditText>(R.id.input)
        Toast.makeText(this, editText.text, Toast.LENGTH_LONG).show()
        findViewById<TextView>(R.id.textview1).setText(editText.text)
    }

    fun butao_nova_atividade(view: View) {
        var editText = findViewById<EditText>(R.id.input)

        val intent = Intent( this, MainActivity2::class.java).apply {
            putExtra(PARAM1_NAME, editText.text.toString())
        }
        startActivity(intent)
    }
}