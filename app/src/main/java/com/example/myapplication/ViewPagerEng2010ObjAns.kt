package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_page.view.*
import kotlinx.android.synthetic.main.item_page.view.firstAnswerRadioButton
import kotlinx.android.synthetic.main.item_page.view.radio_group
import kotlinx.android.synthetic.main.item_page_obj_eng10_ans.view.*


class ViewPagerEng2010ObjAns(
    val list: List<englishObj2010>


) : RecyclerView.Adapter<ViewPagerEng2010ObjAns.Pager2ViewHolder>() {


    inner class Pager2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImg: ImageView = itemView.findViewById(R.id.image1)
        val itemQuestion: TextView = itemView.findViewById(R.id.question1)
        val itemOption1: RadioButton = itemView.findViewById(R.id.firstAnswerRadioButton1)
        val itemOption2: RadioButton = itemView.findViewById(R.id.SecondAnswerRadioButton1)
        val itemOption3: RadioButton = itemView.findViewById(R.id.ThirdAnswerRadioButton1)
        val itemOption4: RadioButton = itemView.findViewById(R.id.FourthAnswerRadioButton1)
        val button: Button = itemView.findViewById(R.id.btn_submit)
        val radio_group: RadioGroup = itemView.findViewById(R.id.radio_group)
        val progressBar: ProgressBar = itemView.findViewById(R.id.progressBar)
        val progressBarText: TextView = itemView.findViewById(R.id.tv_progress)



        init {

        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerEng2010ObjAns.Pager2ViewHolder {
        return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_page_obj_eng10_ans, parent, false))

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

    override fun onBindViewHolder(holder: ViewPagerEng2010ObjAns.Pager2ViewHolder, position: Int) {
        val item = list[position]

        holder.apply {

            itemQuestion.text = item.question

            if (item.CorrectAnswer == 1){
                holder.itemOption1.setBackgroundResource(R.drawable.correct_option_border_bg)
            }
            else if (item.CorrectAnswer == 2) {
                holder.itemOption2.setBackgroundResource(R.drawable.correct_option_border_bg)
            }
            else if (item.CorrectAnswer == 3) {
                holder.itemOption3.setBackgroundResource(R.drawable.correct_option_border_bg)
            }
            else if (item.CorrectAnswer == 4) {
                holder.itemOption4.setBackgroundResource(R.drawable.correct_option_border_bg)
            }

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






