package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main_activity3_eng_obj_2010_ans.*

class MainActivity3_eng_obj_2010_ans : AppCompatActivity() {


    private lateinit var liste: ArrayList<englishObj2010>
    private lateinit var game: ArrayList<Liste>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity3_eng_obj_2010_ans)
        //val number = intent.getIntegerArrayListExtra("lister")


        val test = intent.getIntegerArrayListExtra(Eng2010Constants.ONE)

//        loadCards()
//
////        val listOfCars = mutableListOf<Liste>(
////                Liste(number))
//
//        TabLayoutMediator(tabLayout, view_pager) { tab, position ->
//            //To get the first name of doppelganger celebrities
//            tab.text = "${position + 1}"
//        }.attach()
//    }



    }
}