package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    private var mUserName: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        mUserName = intent.getStringExtra(Eng2010Constants.USER_NAME)

        val Recycler_View = findViewById<RecyclerView>(R.id.recycler_view)

        val listOfCars = mutableListOf<Picture>(
            Picture("Study Past Questions", R.drawable.white_book_and_pen_illustration_4578906),
            Picture("Calculator", R.drawable.calculator),
            Picture("Formular Book", R.drawable.formula)

        )

        Recycler_View.apply {
            layoutManager = GridLayoutManager(this@MainActivity2, 2)
            intent.putExtra(Eng2010Constants.USER_NAME, mUserName)
            adapter = MainActivity2Adapter(listOfCars)
        }
        }
    }
