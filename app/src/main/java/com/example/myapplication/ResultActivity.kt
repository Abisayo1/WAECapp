package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    lateinit var preferences: SharedPreferences



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

       window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)

        val name = preferences.getString("NAME", "Mood")

        userName.text = name



        val totalQuestions = intent.getIntExtra(Eng2010Constants.TOTAL_QUESTIONS, 0)
        val correctAnswer = intent.getIntExtra(Eng2010Constants.CORRECT_ANSWERS, 0)

        score.text = "Your score is $correctAnswer out of $totalQuestions"

        btn_result2.setOnClickListener{

            startActivity(Intent(this, MainActivity::class.java))
            finish()
    }
    }
}