package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Recycler_View = findViewById<RecyclerView>(R.id.recycler_view)

        val listOfCars = mutableListOf<Picture>(
            Picture("Study Past Questions", R.drawable.white_book_and_pen_illustration_4578906),
            Picture("Calculator", R.drawable.calculator),
            Picture("Formular Book", R.drawable.formula)

        )

        Recycler_View.apply {
            layoutManager = GridLayoutManager(this@MainActivity2, 2)
            adapter = MainActivity2Adapter(listOfCars)
        }
        }
    }
