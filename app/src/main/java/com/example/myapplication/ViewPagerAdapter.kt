package com.example.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_page.view.*


class ViewPagerAdapter(
        val list: List<englishObj2010>


) : RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>() {
    var mCorrectAnswers = 0
//    var checkBoxStateArray = SparseBooleanArray()
//    var checkBoxStateArray2 = SparseBooleanArray()


    inner class Pager2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImg: ImageView = itemView.findViewById(R.id.image1)
        private var checkedRadioButton: CompoundButton? = null
        val itemQuestion: TextView = itemView.findViewById(R.id.question1)
        val itemOption1: RadioButton = itemView.findViewById(R.id.firstAnswerRadioButton)
        val itemOption2: RadioButton = itemView.findViewById(R.id.SecondAnswerRadioButton)
        val itemOption3: RadioButton = itemView.findViewById(R.id.ThirdAnswerRadioButton)
        val itemOption4: RadioButton = itemView.findViewById(R.id.FourthAnswerRadioButton)
        val button: Button = itemView.findViewById(R.id.btn_submit)
        val radio_group: RadioGroup = itemView.findViewById(R.id.radio_group)
        val progressBar: ProgressBar = itemView.findViewById(R.id.progressBar)
        val progressBarText: TextView = itemView.findViewById(R.id.tv_progress)
        val rg = radio_group.checkedRadioButtonId
        val meat = itemView
        var mSelectedOptionPosition: Int = 0
        val item = list[mSelectedOptionPosition]
        var nCorrectAnswers = 0


        //var sum = list.sumBy { it.score }


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
                intent.putExtra(Eng2010Constants.CORRECT_ANSWERS, mCorrectAnswers)
                intent.putExtra(Eng2010Constants.TOTAL_QUESTIONS, list!!.size)
                itemView.context.startActivity(intent)
            }


        }


    }


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapter.Pager2ViewHolder {
            return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false))

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

        override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHolder, position: Int) {
            //val post = myDataset.get(holder.absoluteAdapterPosition)
            val item = list[position]
            holder.radio_group.tag = position


//            if (!checkBoxStateArray.get(position, false))
//            {
//
//                holder.itemOption1.isChecked = false
//                holder.itemOption2.isChecked = false
//                holder.itemOption3.isChecked = false
//                holder.itemOption4.isChecked = false
//            }
//            else
//            {
//
//
//                holder.itemOption1.isChecked = true
//                holder.itemOption2.isChecked = true
//                holder.itemOption3.isChecked = true
//                holder.itemOption4.isChecked = true
//            }
            holder.apply {
//                itemOption1.isChecked = one == 1
//               itemOption2.isChecked = two == 1
//
//               itemOption3.isChecked = three == 1
//               itemOption4.isChecked = four == 1
                itemQuestion.text = item.question
                itemOption1.text = item.OptionOne
                itemImg.setImageResource(item.image)
                itemOption2.text = item.OptionTwo
                itemOption3.text = item.OptionThree
                itemOption4.text = item.OptionFour
                progressBar.progress = item.id
                progressBarText.text = "${item.id}" + "/" + progressBar.max

                itemView.radio_group.setOnCheckedChangeListener(
                        RadioGroup.OnCheckedChangeListener{ group, checkedId ->
                        val radioButtonID = itemView.radio_group.getCheckedRadioButtonId()
                        val radioButton: View = itemView.radio_group.findViewById(radioButtonID);
                        val idx = itemView.radio_group.indexOfChild(radioButton)
                        val radio: RadioButton = itemView.findViewById(checkedId)
                            defaultView()



//                            if (!checkBoxStateArray.get(absoluteAdapterPosition, false))
//                            {
//                                radio.isChecked = true
//                                checkBoxStateArray.put(absoluteAdapterPosition, true)
//                            }
//                            else
//                            {
//                                radio.isChecked = false
//                                checkBoxStateArray.put(absoluteAdapterPosition, false)
//                            }

                            if (item.CorrectAnswer == idx) {
                                mCorrectAnswers++
                                nCorrectAnswers++
//                        Toast.makeText(itemView.context, " On checked change :" +
//                            " ${mCorrectAnswers}",
//                        Toast.LENGTH_SHORT).show()
                            }
//                    Toast.makeText(itemView.context, " On checked change :" +
//                            " ${radio.text}",
//                        Toast.LENGTH_SHORT).show()
                        })
            }


        }
    }






