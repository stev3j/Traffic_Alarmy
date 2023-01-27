package com.example.myapplication.data

data class Data(
    val location: String,
    val bus: String,
    val time: String
)

val alarm_bus = listOf<Data>(
    Data("교항리앞", "급행 8", "7분"),
    Data("신당리", "급행 8", "24분"),
)