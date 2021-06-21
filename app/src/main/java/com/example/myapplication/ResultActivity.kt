package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val username = intent.getStringExtra(Eng2010Constants.USER_NAME)
        userName.text = username

        val totalQuestions = intent.getIntExtra(Eng2010Constants.TOTAL_QUESTIONS, 0)
        val correctAnswer = intent.getIntExtra(Eng2010Constants.CORRECT_ANSWERS, 0)

        score.text = "Your score is $correctAnswer out of $totalQuestions"

        btn_result2.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
    }
    }
}