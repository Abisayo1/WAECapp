package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EngYear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eng_year)

        val Recycler_View = findViewById<RecyclerView>(R.id.recycler_view1)

        val listOfYear = mutableListOf<ModelEngYear>(
                ModelEngYear("2010"),
                ModelEngYear("2011"),
                ModelEngYear("2012"),
                ModelEngYear("2013"),
                ModelEngYear("2014"),
                ModelEngYear("2015"),
                ModelEngYear("2016"),
                ModelEngYear("2017"),
                ModelEngYear("2018"),
                ModelEngYear("2019"),
                ModelEngYear("2020"),
                ModelEngYear("2021")

        )

        Recycler_View.apply {
            layoutManager = LinearLayoutManager(this@EngYear)
            adapter = EngYearAdapter(listOfYear)
        }
    }
}