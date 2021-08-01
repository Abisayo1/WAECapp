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
                            else if (item.id == 9){
                                lister.add(8, idx +1)
                            }
                            else if (item.id == 10){
                                lister.add(9, idx +1)
                            }
                            else if (item.id == 11){
                                lister.add(10, idx +1)
                            }
                            else if (item.id == 12){
                                lister.add(11, idx +1)
                            }
                            else if (item.id == 13){
                                lister.add(12, idx +1)
                            }
                            else if (item.id == 14){
                                lister.add(13, idx +1)
                            }
                            else if (item.id == 15){
                                lister.add(14, idx +1)
                            }
                            else if (item.id == 16){
                                lister.add(15, idx +1)
                            }
                            else if (item.id == 17){
                                lister.add(16, idx +1)
                            }
                            else if (item.id == 18){
                                lister.add(17, idx +1)
                            }
                            else if (item.id == 19){
                                lister.add(18, idx +1)
                            }
                            else if (item.id == 20){
                                lister.add(19, idx +1)
                            }
                            else if (item.id == 21){
                                lister.add(20, idx +1)
                            }
                            else if (item.id == 22){
                                lister.add(21, idx +1)
                            }
                            else if (item.id == 23){
                                lister.add(22, idx +1)
                            }
                            else if (item.id == 24){
                                lister.add(23, idx +1)
                            }
                            else if (item.id == 25){
                                lister.add(24, idx +1)
                            }
                            else if (item.id == 26){
                                lister.add(25, idx +1)
                            }
                            else if (item.id == 27){
                                lister.add(26, idx +1)
                            }
                            else if (item.id == 28){
                                lister.add(27, idx +1)
                            }
                            else if (item.id == 29){
                                lister.add(28, idx +1)
                            }
                            else if (item.id == 30){
                                lister.add(29, idx +1)
                            }
                            else if (item.id == 31){
                                lister.add(30, idx +1)
                            }
                            else if (item.id == 32){
                                lister.add(31, idx +1)
                            }
                            else if (item.id == 33){
                                lister.add(32, idx +1)
                            }
                            else if (item.id == 34){
                                lister.add(33, idx +1)
                            }
                            else if (item.id == 35){
                                lister.add(34, idx +1)
                            }
                            else if (item.id == 36){
                                lister.add(35, idx +1)
                            }
                            else if (item.id == 37){
                                lister.add(36, idx +1)
                            }
                            else if (item.id == 38){
                                lister.add(37, idx +1)
                            }
                            else if (item.id == 39){
                                lister.add(38, idx +1)
                            }
                            else if (item.id == 40){
                                lister.add(39, idx +1)
                            }
                            else if (item.id == 41){
                                lister.add(40, idx +1)
                            }
                            else if (item.id == 42){
                                lister.add(41, idx +1)
                            }
                            else if (item.id == 43){
                                lister.add(42, idx +1)
                            }
                            else if (item.id == 44){
                                lister.add(43, idx +1)
                            }
                            else if (item.id == 45){
                                lister.add(44, idx +1)
                            }
                            else if (item.id == 46){
                                lister.add(45, idx +1)
                            }
                            else if (item.id == 47){
                                lister.add(46, idx +1)
                            }
                            else if (item.id == 48){
                                lister.add(47, idx +1)
                            }
                            else if (item.id == 49){
                                lister.add(48, idx +1)
                            }
                            else if (item.id == 50){
                                lister.add(49, idx +1)
                            }
                            else if (item.id == 51){
                                lister.add(50, idx +1)
                            }
                            else if (item.id == 52){
                                lister.add(51, idx +1)
                            }
                            else if (item.id == 53){
                                lister.add(52, idx +1)
                            }
                            else if (item.id == 54){
                                lister.add(53, idx +1)
                            }
                            else if (item.id == 55){
                                lister.add(54, idx +1)
                            }
                            else if (item.id == 56){
                                lister.add(55, idx +1)
                            }
                            else if (item.id == 57){
                                lister.add(56, idx +1)
                            }
                            else if (item.id == 58){
                                lister.add(57, idx +1)
                            }
                            else if (item.id == 59){
                                lister.add(58, idx +1)
                            }
                            else if (item.id == 60){
                                lister.add(59, idx +1)
                            }
                            else if (item.id == 61){
                                lister.add(60, idx +1)
                            }
                            else if (item.id == 62){
                                lister.add(61, idx +1)
                            }
                            else if (item.id == 63){
                                lister.add(62, idx +1)
                            }
                            else if (item.id == 64){
                                lister.add(63, idx +1)
                            }
                            else if (item.id == 65){
                                lister.add(64, idx +1)
                            }
                            else if (item.id == 66){
                                lister.add(65, idx +1)
                            }
                            else if (item.id == 67){
                                lister.add(66, idx +1)
                            }
                            else if (item.id == 68){
                                lister.add(67, idx +1)
                            }
                            else if (item.id == 69){
                                lister.add(68, idx +1)
                            }
                            else if (item.id == 70){
                                lister.add(69, idx +1)
                            }
                            else if (item.id == 71){
                                lister.add(70, idx +1)
                            }
                            else if (item.id == 72){
                                lister.add(71, idx +1)
                            }
                            else if (item.id == 73){
                                lister.add(72, idx +1)
                            }
                            else if (item.id == 74){
                                lister.add(73, idx +1)
                            }
                            else if (item.id == 75){
                                lister.add(74, idx +1)
                            }
                            else if (item.id == 76){
                                lister.add(75, idx +1)
                            }
                            else if (item.id == 77){
                                lister.add(76, idx +1)
                            }
                            else if (item.id == 78){
                                lister.add(77, idx +1)
                            }
                            else if (item.id == 79){
                                lister.add(78, idx +1)
                            }
                            else if (item.id == 80){
                                lister.add(79, idx +1)
                            }
                            else if (item.id == 81){
                                lister.add(80, idx +1)
                            }else if (item.id == 82){
                                lister.add(81, idx +1)
                            }
                            else if (item.id == 83){
                                lister.add(82, idx +1)
                            }
                            else if (item.id == 83){
                                lister.add(82, idx +1)
                            }
                            else if (item.id == 84){
                                lister.add(83, idx +1)
                            }
                            else if (item.id == 85){
                                lister.add(84, idx +1)
                            }
                            else if (item.id == 86){
                                lister.add(85, idx +1)
                            }
                            else if (item.id == 87){
                                lister.add(86, idx +1)
                            }
                            else if (item.id == 88){
                                lister.add(87, idx +1)
                            }
                            else if (item.id == 89){
                                lister.add(88, idx +1)
                            }
                            else if (item.id == 90){
                                lister.add(89, idx +1)
                            }
                            else if (item.id == 91){
                                lister.add(90, idx +1)
                            }
                            else if (item.id == 92){
                                lister.add(91, idx +1)
                            }
                            else if (item.id == 93){
                                lister.add(92, idx +1)
                            }
                            else if (item.id == 94){
                                lister.add(93, idx +1)
                            }
                            else if (item.id == 95){
                                lister.add(94, idx +1)
                            }
                            else if (item.id == 96){
                                lister.add(95, idx +1)
                            }
                            else if (item.id == 97){
                                lister.add(96, idx +1)
                            }
                            else if (item.id == 98){
                                lister.add(97, idx +1)
                            }
                            else if (item.id == 99){
                                lister.add(98, idx +1)
                            }

                            else if (item.id == 100){
                                lister.add(99, idx +1)
                            }



//
//
//
//
//                                Toast.makeText(itemView.context, " On checked change :" +
//                            " ${one}, ${lister[0]}",
//                        Toast.LENGTH_SHORT).show()

//                    Toast.makeText(itemView.context, " On checked change :" +
//                            " ${radio.text}",
//                        Toast.LENGTH_SHORT).show()
                        })
            }


        }
    }






