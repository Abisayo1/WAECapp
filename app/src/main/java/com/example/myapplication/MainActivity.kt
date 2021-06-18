package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.BoringLayout.make
import android.view.View
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar()?.hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        val button = findViewById<Button>(R.id.button1)

        button.setOnClickListener{
            if(et_name.text.toString().isEmpty()){
                Toast.makeText( this,"Please enter your name", Toast.LENGTH_SHORT).show()
            } else {

                val intent = Intent(this, Subjects::class.java)
                startActivity(intent)
            }
        }
    }
}