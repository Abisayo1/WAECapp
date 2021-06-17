package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.provider.SyncStateContract
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.Eng2010Constants.getQuestions
import kotlinx.android.synthetic.main.activity_eng_obj_essay.*
import kotlinx.android.synthetic.main.activity_main.*

class EngObjEssay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eng_obj_essay)

        button.setOnClickListener{
              val intent = Intent(this, MainActivity3::class.java)
               startActivity(intent)
            }
        }


    }
