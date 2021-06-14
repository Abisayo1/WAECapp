package com.example.myapplication

data class Subject (var Title: String)

object Supplier {
    val subjects = listOf<Subject>(
        Subject("English Language"),
        Subject("Mathematics"),
        Subject("Geography"),
        Subject("Economics"),
        Subject("Chemistry"),
        Subject("Physics")
    )
}

