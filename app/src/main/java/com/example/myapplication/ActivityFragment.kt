package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.list_item2.*

/**
 * The number of pages (wizard steps) to show in this demo.
 */
private const val NUM_PAGES = 5

class ActivityFragment : FragmentActivity() {}
//
//    /**
//     * The pager widget, which handles animation and allows swiping horizontally to access previous
//     * and next wizard steps.
//     */
//    private lateinit var viewPager: ViewPager2
//
//
//    @SuppressLint("SetTextI18n")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_fragment)
//       // val progress = findViewById<ProgressBar>(R.id.progressBar)
//        // Instantiate a ViewPager2 and a PagerAdapter.
//        viewPager = findViewById(R.id.pager)
//
//        // The pager adapter, which provides the pages to the view pager widget.
//        val pagerAdapter = ScreenSlidePagerAdapter(this)
//        viewPager.adapter = pagerAdapter
//
//
//
//
//
//        val Image = findViewById<ImageView>(R.id.image1)
//        val questionsList = Eng2010Constants.getQuestions()
////        Log.i("Questions Size", "${questionsList.size}")
//
//
//        val currentPosition = 1
//        val question: Eng2010Obj? = questionsList[currentPosition -1]
//
//
//
//
////        progress.progress = currentPosition
// //       tv_progress.text = "$currentPosition" + "/" +  progress.max
//
////        question1.text = question!!.question.toString()
////        Image.setImageResource(question.image)
////        option1.text = question.OptionOne
////        option2.text = question.OptionTwo
////        option3.text = question.OptionThree
////        option4.text = question.OptionFour
////    }
//
//    override fun onBackPressed() {
//        if (viewPager.currentItem == 0) {
//            // If the user is currently looking at the first step, allow the system to handle the
//            // Back button. This calls finish() on this activity and pops the back stack.
//            super.onBackPressed()
//        } else {
//            // Otherwise, select the previous step.
//            viewPager.currentItem = viewPager.currentItem - 1
//        }
//    }
//
//    /**
//     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
//     * sequence.
//     */
//    private inner class ScreenSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
//        override fun getItemCount(): Int = NUM_PAGES
//
//        override fun createFragment(position: Int): Fragment = BlankActivity()
//    }
//}


