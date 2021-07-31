package com.example.myapplication

import android.content.Intent
import android.content.SharedPreferences
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
    private var lister: MutableList<Int> = arrayListOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)





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
        var nCorrectAnswers = 0
        var globalVariable = GlobalClass()
        val team = globalVariable.One
        var one = 0
        var two = 0
        var three = 0
        var four = 0
        var five = 0
        var six = 0
        var seven = 0
        var eight = 0
        var nine = 0
        var ten = 0
        var eleven = 0
        var twelve = 0
        var thirteen = 0
        var fourteen = 0
        var fifteen = 0
        var sixteen = 0
        var seventeen = 0
        var eighteen = 0
        var nineteen = 0
        var twenty = 0
        var twenty_one = 0
        var twenty_two = 0
        var twenty_three = 0
        var twenty_four = 0
        var twenty_five = 0
        var twenty_six = 0
        var twenty_seven = 0
        var twenty_eight = 0
        var twenty_nine = 0
        var thirty = 0
        var thirty_one = 0
        var thirty_two = 0
        var thirty_three = 0
        var thirty_four = 0
        var thirty_five = 0
        var thirty_six = 0
        var thirty_seven = 0
        var thirty_eight = 0
        var thirty_nine = 0
        var forty = 0
        var forty_one = 0
        var forty_two = 0
        var forty_three = 0
        var forty_four = 0
        var fortyFive = 0
        var fortySix = 0
        var fortySeven = 0
        var fortyEight = 0
        var fortyNine = 0
        var fifty = 0
        var fiftyOne = 0
        var fiftyTwo = 0
        var fiftyThree = 0
        var fiftyFour = 0
        var fiftyFive = 0
        var fiftySix = 0
        var fiftySeven = 0
        var fiftyEight = 0
        var fiftyNine = 0
        var sixty = 0
        var sixtyOne = 0
        var sixtyTwo = 0
        var sixtythree = 0
        var sixtyFour = 0
        var sixtyFive = 0
        var sixtySix = 0
        var sixtySeven = 0
        var sixtyEight = 0
        var sixtyNine = 0
        var seventy = 0
        var seventyOne = 0
        var seventyTwo = 0
        var seventythree = 0
        var seventyFour = 0
        var seventyFive = 0
        var seventySix = 0
        var seventySeven = 0
        var seventyEight = 0
        var seventyNine = 0
        var eighty = 0
        var eightyOne = 0
        var eightyTwo = 0
        var eightyThree = 0
        var eightyFour = 0
        var eightyfive = 0
        var eightySix = 0
        var eightySeven = 0
        var eightyEight = 0
        var eightyNine = 0
        var ninety = 0
        var ninetyOne = 0
        var ninetyTwo = 0
        var ninetyThree = 0
        var ninetyFour = 0
        var ninetyFive = 0
        var ninetySix = 0
        var ninetySeven = 0
        var ninetyEight = 0
        var ninetyNine = 0
        var hundred = 0


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
                val intent = Intent(itemView.context, ResultActivity::class.java)
                intent.putExtra(Eng2010Constants.CORRECT_ANSWERS, mCorrectAnswers)
                //intent.putIntegerArrayListExtra("lister", ArrayList(lister))
                intent.putExtra(Eng2010Constants.ONE, lister as ArrayList<Int?>?)
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
            val item = list[position]

            holder.apply {
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
                        var idx = itemView.radio_group.indexOfChild(radioButton)
                        val radio: RadioButton = itemView.findViewById(checkedId)
                            defaultView()
                            var num: Int = idx+ 1

                            if (item.CorrectAnswer == num) {
                                mCorrectAnswers++
                                nCorrectAnswers++}
                            if (item.id == 1){
                                lister.add(0, idx +1)
                            }
                            else if (item.id == 2){
                                lister.add(1, idx +1)
                            }
                            else if (item.id == 3){
                                lister.add(2, idx +1)
                            }
                            else if (item.id == 4){
                                lister.add(3, idx +1)
                            }
                            else if (item.id == 5){
                                lister.add(4, idx +1)
                            }
                            else if (item.id == 6){
                                lister.add(5, idx +1)
                            }
                            else if (item.id == 7){
                                lister.add(6, idx +1)
                            }
                            else if (item.id == 8){
                                lister.add(7, idx +1)
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }
                            else if (item.id == 2){
                                two = idx + 1
                            }





                                Toast.makeText(itemView.context, " On checked change :" +
                            " ${one}, ${lister[0]}",
                        Toast.LENGTH_SHORT).show()

//                    Toast.makeText(itemView.context, " On checked change :" +
//                            " ${radio.text}",
//                        Toast.LENGTH_SHORT).show()
                        })
            }


        }
    }






