package com.example.myapplication

object Eng2010Constants {
    fun getQuestions(): ArrayList<Eng2010Obj> {

        val questionsList = ArrayList<Eng2010Obj>()

        val que1 = Eng2010Obj(1,
                question = R.string.Questions,
                OptionOne = "ugly",
                OptionTwo = "meagre",
                OptionThree = "modest",
                OptionFour = "lowly",
                CorrectAnswer = 2,
                image = 0
        )

        questionsList.add(que1)
        return questionsList
    }
}
