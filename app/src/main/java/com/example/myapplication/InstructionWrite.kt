package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_eng_obj_essay.*
import kotlinx.android.synthetic.main.activity_instruction_write.*

class InstructionWrite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instruction_write)


        button3.setOnClickListener{
            val intent = Intent(this, WritingLearn::class.java)
            startActivity(intent)

        }

    }
}