package com.example.myapplication

import android.provider.Settings.Secure.getString
import com.example.myapplication.R as R1

object Eng2010Constants {

    var USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    const val mSELECTED: Int = 0

    fun getQuestions(): ArrayList<Eng2010Obj> {

        val questionsList = ArrayList<Eng2010Obj>()

        val que1 = Eng2010Obj(
                id =1,
                question = "R1.string.Questions",
                OptionOne = "ugly",
                OptionTwo = "meagre",
                OptionThree = "modest",
                OptionFour = "lowly",
                CorrectAnswer = 2,
                image = 0,
                Answers = "Behold the lamb",
                AnswersImg = 0
        )

        questionsList.add(que1)

        val que2 = Eng2010Obj(
                id =1,
                question = "R1.string.Questions",
                OptionOne = "ugly",
                OptionTwo = "meagre",
                OptionThree = "modest",
                OptionFour = "lowly",
                CorrectAnswer = 2,
                image = R1.drawable.calculator,
            Answers = "Behold the lamb",
            AnswersImg = 0
        )

        questionsList.add(que2)

        val que3 = Eng2010Obj(
                id =1,
                question = "R1.string.Questions",
                OptionOne = "ugly",
                OptionTwo = "meagre",
                OptionThree = "modest",
                OptionFour = "lowly",
                CorrectAnswer = 2,
                image = R1.drawable.calculator,
            Answers = "Behold the lamb",
            AnswersImg = 0
        )

        questionsList.add(que3)

        val que4 = Eng2010Obj(
                id =1,
                question = "${(R1.string.Questions)}",
                OptionOne = "ugly",
                OptionTwo = "meagre",
                OptionThree = "modest",
                OptionFour = "lowly",
                CorrectAnswer = 2,
                image = 0,
            Answers = "Behold the lamb",
            AnswersImg = 0
        )

        questionsList.add(que4)

        return questionsList
    }
}
