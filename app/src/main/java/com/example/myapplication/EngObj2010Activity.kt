package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        liste.add(englishObj2010(1, getText(R.string.Question1), 0, "(A)\t ugly", "(B)\t meagre", "(C)\t modest", "(D)\t lowly", 2, 0, null))
        liste.add(englishObj2010(2, getText(R.string.Question2), 0, "(A)\t neglect", "(B)\t ignorance", "(C)\t poverty", "(D)\t obscurity", 4, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 4, 0, null))
        liste.add(englishObj2010(4, getText(R.string.Question4), 0, "(A)\t minute", "(B)\t crucial", "(C)\t compulsory", "(D)\t marvellous", 2, 0, null))
        liste.add(englishObj2010(5, getText(R.string.Question5), 0, "(A)\t flexible", "(B)\t frank", "(C)\t irresponsible", "(D)\t careless", 1, 0, null))
        liste.add(englishObj2010(6, getText(R.string.Question6), 0, "(A)\t clear", "(B)\t turgid", "(C)\t timid", "(D)\t incoherent", 4, 0, null))
        liste.add(englishObj2010(7, getText(R.string.Question7), 0, "(A)\t unfaithful", "(B)\t unkind", "(C)\t selfish", "(D)\t hostile", 1, 0, null))
        liste.add(englishObj2010(8, getText(R.string.Question8), 0, "(A)\t blamed", "(B)\t dismissed", "(C)\t upheld", "(D)\t acquitted", 4, 0, null))
        liste.add(englishObj2010(9, getText(R.string.Question9), 0, "(A)\t dividing", "(B)\t destroying", "(C)\t separating", "(D)\t isolating", 3, 0, null))
        liste.add(englishObj2010(10, getText(R.string.Question10), 0, "(A)\t persisted", "(B)\t deteriorated", "(C)\t deepened", "(D)\t decreased", 2, 0, null))
        liste.add(englishObj2010(11, getText(R.string.Question11), 0, "(A)\t communal", "(B)\t individual", "(C)\t mutual", "(D)\t personal", 3, 0, null))
        liste.add(englishObj2010(12, getText(R.string.Question12), 0, "(A)\t alternatively", "(B)\t simultaneously", "(C)\t consecutively", "(D)\t separately", 2, 0, null))
        liste.add(englishObj2010(13, getText(R.string.Question13), 0, "(A)\t lengthy", "(B)\t current", "(C)\t lasting", "(D)\t strong", 3, 0, null))
        liste.add(englishObj2010(14, getText(R.string.Question14), 0, "(A)\t distraction", "(B)\t commotion", "(C)\t confusion", "(D)\t rivalry", 4, 0, null))
        liste.add(englishObj2010(15, getText(R.string.Question15), 0, "(A)\t literally", "(B)\t simply", "(C)\t frankly", "(D)\t directly", 4, 0, null))
        liste.add(englishObj2010(16, getText(R.string.Question16), 0, "(A)\t clarity", "(B)\t authenticity", "(C)\t formality", "(D)\t simplicity", 2, 0, null))
        liste.add(englishObj2010(17, getText(R.string.Question17), 0, "(A)\t picture", "(B)\t appearance", "(C)\t expression", "(D)\t sight", 3, 0, null))
        liste.add(englishObj2010(18, getText(R.string.Question18), 0, "(A)\t inspired", "(B)\t generated", "(C)\t conceived", "(D)\t revealed", 3, 0, null))
        liste.add(englishObj2010(19, getText(R.string.Question19), 0, "(A)\t hold-up", "(B)\t blockade", "(C)\t stand still", "(D)\t suspense", 3, 0, null))
        liste.add(englishObj2010(20, getText(R.string.Question20), 0, "(A)\t memoranda", "(B)\t decisions", "(C)\t resolutions", "(D)\t actions", 3, 0, null))
        liste.add(englishObj2010(21, getText(R.string.Question21), 0, "(A)\t were always angry with each other", "(B)\t always wore daggers", "(C)\t were good at drawing daggers", "(D)\t were fighting everybody", 1, 0, null))
        liste.add(englishObj2010(22, getText(R.string.Question22), 0, "(A)\t the corners of the pages of my book are crumpled", "(B)\t my book is designed like dog's ears", "(C)\t my book is torn", "(D)\t my book is indispensable", 3, 0, null))
        liste.add(englishObj2010(23, getText(R.string.Question23), 0, "(A)\t a kind of capitalist", "(B)\t a thoughtful capitalist", "(C)\t an old capitalist", "(D)\t an unbending capitalist;", 4, 0, null))
        liste.add(englishObj2010(24, getText(R.string.Question24), 0, "(A)\t respect me", "(B)\t hate herself", "(C)\t apologize", "(D)\t be ashamed", 4, 0, null))
        liste.add(englishObj2010(25, getText(R.string.Question25), 0, "(A)\t about buying things from the shop", "(B)\t about their job", "(C)\t all the time", "(D)\t about taking me to the shop", 3, 0, null))
        liste.add(englishObj2010(26, getText(R.string.Question26), 0, "(A)\t yielded positive results", "(B)\t cost him a lot of money", "(C)\t was unsuccessful", "(D)\t caused him some trouble", 1, 0, null))
        liste.add(englishObj2010(27, getText(R.string.Question27), 0, "(A)\t always paints her fingers green", "(B)\t is good at growing plants", "(C)\t turns everything she touches to green", "(D)\t likes keeping green objects", 2, 0, null))
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
