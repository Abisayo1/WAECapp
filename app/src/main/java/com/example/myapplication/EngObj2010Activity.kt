package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.AdaptiveIconDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.progressindicator.CircularProgressIndicator
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.item_page.*
import kotlinx.android.synthetic.main.list_item2.*
import me.relex.circleindicator.CircleIndicator3

class MainActivity3 : AppCompatActivity() //,View.OnClickListener
 {


//    private var mCurrentPosition: Int = 1
//    private var mQuestionsList: ArrayList<Eng2010Obj>? = null
//    private var mSelectedOptionPosition: Int = 0
//    private var mCorrectAnswers: Int = 0
//    private var mUserName: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        var doppelgangerPageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                Toast.makeText(applicationContext, "Selected position: ${position}",
                        Toast.LENGTH_SHORT).show()

            }

        }




//        view_pager2.adapter = ViewPagerAdapter(
//
//        )
//        view_pager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
//
//        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
//        indicator.setViewPager(view_pager2)



        val questions = mutableListOf<englishObj2010>(
             englishObj2010(1,  getString(R.string.Questions), 0, "(A)" + "meagre", "(B)" +"lowly", "(C)" +"love", "(D)" +"babe", 2),
             englishObj2010(2,  getString(R.string.Questions), 0,"You", "meagre", "lowly", "love", 2),
             englishObj2010(3, getString(R.string.Questions), 0, "ME", "meagre", "lowly", "love", 2)
     )

        val adapter = ViewPagerAdapter(questions)
        view_pager2.adapter = adapter

        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
        indicator.setViewPager(view_pager2)
//        view_pager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
//
//        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
//        indicator.setViewPager(view_pager2)
//
//        mUserName = intent.getStringExtra(Eng2010Constants.USER_NAME)
//
//        mQuestionsList = Eng2010Constants.getQuestions()
//        setQuestion()
//
//        option1.setOnClickListener(this)
//        option2.setOnClickListener(this)
//        option3.setOnClickListener(this)
//        option4.setOnClickListener(this)
//
//        btn_submit.setOnClickListener(this)
//
//
//    }
//
//    private fun setQuestion() {
//        val Image = findViewById<ImageView>(R.id.image1)
//
//        val question = mQuestionsList!![mCurrentPosition - 1]
//
//
//        defaultOptionsView()
//
//        if (mCurrentPosition == mQuestionsList!!.size) {
//            btn_submit.text = "Finsish"
//            }else{
//            btn_submit.text = "submit"
//        }
//
//        progressBar.progress = mCurrentPosition
//        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max
//
//        question1.text = question!!.question
//        Image.setImageResource(question.image)
//        option1.text = question.OptionOne
//        option2.text = question.OptionTwo
//        option3.text = question.OptionThree
//        option4.text = question.OptionFour
//    }
//
//    private fun defaultOptionsView() {
//        val options = ArrayList<TextView>()
//        options.add(0, option1)
//        options.add(1, option2)
//        options.add(2, option3)
//        options.add(3, option4)
//
//        for (option in options) {
//            option.setTextColor(Color.parseColor("#7A8089"))
//            option.typeface = Typeface.DEFAULT
//            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
//        }
//
//    }
//
//    override fun onClick(v: View?) {
//        when (v?.id) {
//            R.id.option1 -> {
//                selectedOptionView(option1, 1)
//            }
//            R.id.option2 -> {
//                selectedOptionView(option2, 2)
//            }
//            R.id.option3 -> {
//                selectedOptionView(option3, 3)
//            }
//            R.id.option4 -> {
//                selectedOptionView(option4, 4)
//            }
//
//            R.id.btn_submit -> {
//
//                if (mSelectedOptionPosition == 0) {
//                    mCurrentPosition ++
//
//                    when{
//                        mCurrentPosition <= mQuestionsList!!.size ->{
//                            setQuestion()
//                        }else ->{
//                        val intent = Intent(this, ResultActivity::class.java)
//                        intent.putExtra(Eng2010Constants.USER_NAME, mUserName)
//                        intent.putExtra(Eng2010Constants.CORRECT_ANSWERS, mCorrectAnswers)
//                        intent.putExtra(Eng2010Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
//                        startActivity(intent)
//                        finish()
//                    }
//                    }
//                }else{
//                    val question = mQuestionsList?.get(mCurrentPosition -1)
//                    if (question!!.CorrectAnswer != mSelectedOptionPosition) {
//                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
//                    }else{
//                        mCorrectAnswers ++
//                    }
//
//                    answerView(question.CorrectAnswer, R.drawable.correct_option_border_bg)
//
//                    if (mCurrentPosition == mQuestionsList!!.size) {
//                        btn_submit.text = "Finish"
//                    }else {
//                        btn_submit.text = "Go to Next Question"
//                    }
//
//                    mSelectedOptionPosition = 0
//                }
//
//            }
//        }
//    }
//
//    private fun answerView(answer: Int, drawableView: Int) {
//        when (answer) {
//            1 ->{
//                option1.background = ContextCompat.getDrawable(this, drawableView)
//            }
//                2
//            -> {
//                option2.background = ContextCompat.getDrawable(this, drawableView)
//            }
//            3 ->{
//                option3.background = ContextCompat.getDrawable(this, drawableView)
//            }
//                4
//            -> {
//                option4.background = ContextCompat.getDrawable(this, drawableView)
//            }
//        }
//    }
//
//    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
//        defaultOptionsView()
//        mSelectedOptionPosition = selectedOptionNum
//        tv.setTextColor(Color.parseColor("#363A43"))
//        tv.setTypeface(tv.typeface, Typeface.BOLD)
//        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)


    }


 }




