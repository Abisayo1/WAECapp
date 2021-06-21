package com.example.myapplication

import android.provider.Settings.Secure.getString
import com.example.myapplication.R as R1

object Eng2010Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    const val mSELECTED: Int = 0

    fun getQuestions(): ArrayList<Eng2010Obj> {

        val questionsList = ArrayList<Eng2010Obj>()

        val que1 = Eng2010Obj(
                id =1,
                question = """I am going to the market to get the following stuff
                    |1. Maggi
                    |2, Eba
                    |3. Tomato
                """.trimMargin(),
                OptionOne = "ugly",
                OptionTwo = "meagre",
                OptionThree = "modest",
                OptionFour = "lowly",
                CorrectAnswer = 2,
                image = 0
        )

        questionsList.add(que1)

        val que2 = Eng2010Obj(
                id =1,
                question = "What is the name of:" +
                        "I am not great oo" +
                        "no go dey do pass yourself ",
                OptionOne = "ugly",
                OptionTwo = "meagre",
                OptionThree = "modest",
                OptionFour = "lowly",
                CorrectAnswer = 2,
                image = R1.drawable.calculator
        )

        questionsList.add(que2)

        val que3 = Eng2010Obj(
                id =1,
                question = "What is the name of:" +
                        "I am not great oo" +
                        "no go dey do pass yourself ",
                OptionOne = "ugly",
                OptionTwo = "meagre",
                OptionThree = "modest",
                OptionFour = "lowly",
                CorrectAnswer = 2,
                image = R1.drawable.calculator
        )

        questionsList.add(que3)

        val que4 = Eng2010Obj(
                id =1,
                question = """I am going to teh market to see someon
                    |Now when i get back i want ot eat yam and egg
                    |do  not frub whatv is nit fryable 
                    |na wa oo
                """.trimMargin(),
                OptionOne = "ugly",
                OptionTwo = "meagre",
                OptionThree = "modest",
                OptionFour = "lowly",
                CorrectAnswer = 2,
                image = 0
        )

        questionsList.add(que4)

        return questionsList
    }
}
