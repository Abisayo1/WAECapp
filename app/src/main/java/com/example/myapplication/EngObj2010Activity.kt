package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.list_item2.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val Image = findViewById<ImageView>(R.id.image1)
        val questionsList = Eng2010Constants.getQuestions()
//        Log.i("Questions Size", "${questionsList.size}")


        val currentPosition = 1
        val question: Eng2010Obj? = questionsList[currentPosition -1]




        progressBar.progress = currentPosition
        tv_progress.text = "$currentPosition" + "/" +  progressBar.max

        question1.text = question!!.question.toString()
        Image.setImageResource(question.image)
        option1.text = question.OptionOne
        option2.text = question.OptionTwo
        option3.text = question.OptionThree
        option4.text = question.OptionFour
    }
    }
