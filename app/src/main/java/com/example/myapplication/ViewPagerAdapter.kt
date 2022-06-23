package com.example.myapplication

import android.annotation.SuppressLint
import android.bluetooth.BluetoothStatusCodes.SUCCESS
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.media.AudioRecord.SUCCESS
import android.media.AudioTrack.SUCCESS
import android.os.Build
import android.speech.tts.TextToSpeech
import android.speech.tts.TextToSpeech.QUEUE_ADD
import android.speech.tts.TextToSpeech.SUCCESS
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_page.view.*
import java.util.*


class ViewPagerAdapter(
    val list: List<englishObj2010>


) : RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>() {
    var mCorrectAnswers = 0
    lateinit var tts: TextToSpeech
    private var lister: MutableList<Int> = arrayListOf(
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0
    )


//    var checkBoxStateArray = SparseBooleanArray()
//    var checkBoxStateArray2 = SparseBooleanArray()


    inner class Pager2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //private var checkedRadioButton: CompoundButton? = null
        val itemQuestion: TextView = itemView.findViewById(R.id.question12)
        val itemQuestions: TextView = itemView.findViewById(R.id.question123)
        val itemQuestion8: TextView = itemView.findViewById(R.id.question8)
        val button: Button = itemView.findViewById(R.id.fabPlay)

        //val progressBar: ProgressBar = itemView.findViewById(R.id.progressBar)
        //val progressBarText: TextView = itemView.findViewById(R.id.tv_progress)
        var nCorrectAnswers = 0
        var globalVariable = GlobalClass()
        val team = globalVariable.One


        fun defaultView() {
            if (nCorrectAnswers >= 1) {
                mCorrectAnswers--
                nCorrectAnswers = 0
            }
        }


        init {

////                        if (checkedId == R.id.firstAnswerRadioButton) {
//                            defaultView()
//                            if (item.CorrectAnswer == 1) {
//                                mCorrectAnswers++
//                            }
//                        } else if (checkedId == R.id.SecondAnswerRadioButton) {
//                            defaultView()
//                            if (item.CorrectAnswer == 2) {
//                                mCorrectAnswers++
//                            }
//                        } else if (checkedId == R.id.ThirdAnswerRadioButton) {
//                            defaultView()
//                            if (item.CorrectAnswer == 3) {
//                                mCorrectAnswers++
//                            }
//                        } else if (checkedId == R.id.FourthAnswerRadioButton) {
//                            defaultView()
//                            Toast.makeText(itemView.context, "Selected position:",
//                                    Toast.LENGTH_SHORT).show()
//
//                            if (item.CorrectAnswer == 4) {
//                                mCorrectAnswers++
//                            }
//
//
//                    })


            button.setOnClickListener {
                tts = TextToSpeech(itemView.context, TextToSpeech.OnInitListener {
                    if (it == TextToSpeech.SUCCESS) {

                        tts.language = Locale.UK
                        tts.setSpeechRate(1.0f)
                        tts.speak(
                            itemQuestion.text?.trim().toString(),
                            TextToSpeech.QUEUE_ADD,
                            null
                        )
                    }
                })
            }


        }


    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.Pager2ViewHolder {
        return Pager2ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false)
        )

    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemCount(): Int {
        return list.size
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHolder, position: Int) {
        var item = list[position]

        holder.apply {
            itemQuestion.text = item.question
            itemQuestions.text = item.OptionOne

            itemQuestion8.text = when (position) {
                7 -> "Consonants Sounds: Plosives"
                8 -> "Consonants Sounds: Plosives"
                9 -> "Consonants Sounds: Plosives"
                10 -> "Consonants Sounds: Plosives"
                11 -> "Consonants Sounds: Plosives"
                12 -> "Consonants Sounds: Plosives"
                13 -> "Consonants Sounds: Plosives"
                14 -> "Consonants Sounds: Affricates"
                15 -> "Consonants Sounds: Affricates"
                16 -> "Consonants Sounds: Nasals"
                17 -> "Consonants Sounds: Nasals"
                18 -> "Consonants Sounds: Nasals"
                19 -> "Consonants Sounds: Approximants"
                20 -> "Consonants Sounds: Approximants"
                21 -> "Consonants Sounds: Approximants"
                22 -> "Consonants Sounds: Approximants"

                else -> "Consonants Sounds: Fricatives"
            }

             if (position == 23 )
            {
                itemQuestions.text = "Vowels"
                itemQuestions.setTextColor(R.color.purple_500)
                itemQuestions.setTextSize(TypedValue.COMPLEX_UNIT_SP, 67.toFloat());
                itemQuestion8.text = ""
                button.setVisibility(View.GONE)
            }


        }
    }
}