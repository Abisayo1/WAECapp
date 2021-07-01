package com.example.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager

class ViewPagerAdapter (
    val list: List<englishObj2010>) : RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>()

{

    inner class Pager2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImg: ImageView = itemView.findViewById(R.id.image1)
        val itemQuestion: TextView = itemView.findViewById(R.id.question1)
        val itemOption1: RadioButton = itemView.findViewById(R.id.firstAnswerRadioButton)
        val itemOption2: RadioButton = itemView.findViewById(R.id.SecondAnswerRadioButton)
        val itemOption3: RadioButton = itemView.findViewById(R.id.ThirdAnswerRadioButton)
        val itemOption4: RadioButton = itemView.findViewById(R.id.FourthAnswerRadioButton)
        val button: Button = itemView.findViewById(R.id.btn_submit)
        val radio_group: RadioGroup = itemView.findViewById(R.id.radio_group)
        val progressBar: ProgressBar = itemView.findViewById(R.id.progressBar)
        val progressBarText: TextView = itemView.findViewById(R.id.tv_progress)
        val mCurrentPosition = absoluteAdapterPosition

        var currentenglishObj2010: englishObj2010? = null
        var currentPosition: Int = 0


        var mCurrentanswers: Int = 0
        var mSelectedOptionPosition: Int = 0






        init {

            radio_group.setOnCheckedChangeListener(
                    RadioGroup.OnCheckedChangeListener { group, checkedId ->
                        val radio: RadioButton = itemView.findViewById(checkedId)
                        Toast.makeText(itemView.context," On checked change :"+
                                " ${radio.text}",
                                Toast.LENGTH_SHORT).show()
                    })

            fun onPageSelected(position: Int) {
                currentPosition = position

            }




            itemOption1.setOnClickListener { v: View ->
                val position = adapterPosition
            }

            fun selectedOption(tv: RadioButton, selectedOptionNum: Int) {
                mSelectedOptionPosition = selectedOptionNum
            }

            itemOption2.setOnClickListener { v: View ->
                val position = adapterPosition
            }

            itemOption3.setOnClickListener { v: View ->
                val position = adapterPosition
            }
            itemOption4.setOnClickListener { v: View ->
                val position = adapterPosition
            }
            button.setOnClickListener {
                val intent = Intent(itemView.context, ResultActivity::class.java)
                itemView.context.startActivity(intent)
            }

            fun answerView(answer: Int){
                when (answer){
                    1 ->{

                    }
                }
            }

        }



    }

                override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapter.Pager2ViewHolder {
                    return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false))
                }

                override fun getItemCount(): Int {
                    return list.size
                }

                override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHolder, position: Int) {
                    //val post = myDataset.get(holder.absoluteAdapterPosition)
                    val item = list[position]
                    holder.apply {itemQuestion.text = item.question
                                  itemOption1.text = item.OptionOne
                                  itemImg.setImageResource(item.image)
                                  itemOption2.text = item.OptionTwo
                                  itemOption3.text = item.OptionThree
                                  itemOption4.text = item.OptionFour
                                     progressBar.progress = item.id
                        progressBarText.text = "${item.id}" + "/" + progressBar.max


                    }





                }

            }
