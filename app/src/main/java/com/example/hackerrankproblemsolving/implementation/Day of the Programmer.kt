package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'dayOfProgrammer' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER year as parameter.
 */

fun dayOfProgrammer(year: Int): String {
    // Write your code here
    return when {
        year < 1918 -> {
            val isLeap = year % 4 == 0
            val day = if (isLeap) 256 - 244 else 256 - 243
            "$day.09.$year"
        }
        year == 1918 -> {
            val day = 256 - (31 + 15 + 31 + 30 + 31 + 30 + 31 + 31)
            "$day.09.$year"
        }
        else -> {
            val isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)
            val day = if (isLeap) 256 - 244 else 256 - 243
            "$day.09.$year"
        }
    }
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
