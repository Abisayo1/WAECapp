package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() //,View.OnClickListener
{
    private lateinit var liste: ArrayList<englishObj2010>

   // private var mCorrectAnswers: Int = 0
    private var nCorrectAnswers: Int = 0


    var doppelgangerPageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {

//            Toast.makeText(applicationContext, "Selected position: ${liste[position].CorrectAnswer}",
//                    Toast.LENGTH_SHORT).show()
////            Toast.makeText(applicationContext, "Selected position: ${position}",
//                    Toast.LENGTH_SHORT).show()
        }

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            var option1 = liste[position].OptionOne
            var option2 = liste[position].OptionTwo
            var option3 = liste[position].OptionThree
            var option4 = liste[position].OptionFour



            }


        }










//    private var mSelectedOptionPosition: Int = 0


//    private var mUserName: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        loadCards()

        TabLayoutMediator(tabLayout, view_pager) { tab, position ->
            //To get the first name of doppelganger celebrities
            tab.text = "${position + 1}"
        }.attach()



        view_pager.registerOnPageChangeCallback(doppelgangerPageChangeCallback)
//        view_pager2.adapter = ViewPagerAdapter(
//
//        )
//        view_pager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
//
//        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
//        indicator.setViewPager(view_pager2)


    }

    private fun loadCards() {
        liste = ArrayList()
        liste.add(englishObj2010(1, getText(R.string.Question1), 0, "(A)\t ugly", "(B)\t meagre", "(C)\t modest", "(D)\t lowly", 1, 0, null))
        liste.add(englishObj2010(2, getText(R.string.Question2), 0, "(A)\t neglect", "(B)\t ignorance", "(C)\t poverty", "(D)\t obscurity", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))

        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 3, 0, null))






        val adapter = ViewPagerAdapter(liste)
        view_pager.adapter = adapter

//        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
//        indicator.setViewPager(view_pager)

    }

    fun onRadioButtonClicked(view: View) {}

//        view_pager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
//
//        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
//        indicator.setViewPager(view_pager2)
//
//        mUserName = intent.getStringExtra(Eng2010Constants.USER_NAME)
//

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
