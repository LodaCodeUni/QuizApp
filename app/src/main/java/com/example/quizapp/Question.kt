package com.example.quizapp

data class Question(val textResId: Int, val answer: Boolean)

val questions = listOf(
    Question(R.string.question_android, true),
    Question(R.string.question_linux, true),
    Question(R.string.question_windows, false),
    Question(R.string.question_mac, true),
    Question(R.string.question_activity, true),
    Question(R.string.question_lifecycle, true),
    Question(R.string.question_fragment, false),
    Question(R.string.question_recyclerview, true),
    Question(R.string.question_intent, true)
)