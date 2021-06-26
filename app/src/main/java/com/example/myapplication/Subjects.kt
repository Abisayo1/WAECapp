package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Supplier.subjects
import kotlinx.android.synthetic.main.activity_subjects.*

//import kotlinx.android.synthetic.main.activity_subjects.*
//import java.util.function.Supplier

class Subjects : AppCompatActivity() {

    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects)

        mUserName = intent.getStringExtra(Eng2010Constants.USER_NAME)


        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        recycler_view.layoutManager = layoutManager

        val adapter = SubjectsAdapter(this, subjects)
        recycler_view.adapter = adapter


    }
}