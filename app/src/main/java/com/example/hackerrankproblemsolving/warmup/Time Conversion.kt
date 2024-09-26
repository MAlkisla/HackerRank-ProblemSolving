package com.example.hackerrankproblemsolving.warmup

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
    val amPm = s.takeLast(2)
    val time = s.dropLast(2)
    val hour = time.take(2).toInt()

    return when {
        amPm == "AM" && hour == 12 -> "00" + time.drop(2)
        amPm == "PM" && hour < 12 -> String.format("%02d", hour + 12) + time.drop(2)
        amPm == "AM" || hour == 12 -> time
        else -> time
    }
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
