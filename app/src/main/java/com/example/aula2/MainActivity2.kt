package com.example.aula2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.aula2.adapters.TodoAdapter
import com.example.aula2.models.Todo
import kotlinx.android.synthetic.main.activity_main2.*
import java.time.LocalDate

class MainActivity2 : AppCompatActivity() {

    private lateinit var todoAdapter: TodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        todoAdapter = TodoAdapter(ArrayList())

        rvToDoItems.adapter = todoAdapter
        rvToDoItems.layoutManager = LinearLayoutManager(this)

        btnToDo.setOnClickListener{
           val todoTitle = etToDo.text.toString()
           if(todoTitle.isNotEmpty()){
               val todo = Todo(todoTitle, LocalDate.now())

               todoAdapter.addTodo(todo)

               etToDo.text.clear()
           }
        }
    }
}