package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'timeInWords' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER h
 *  2. INTEGER m
 */

fun timeInWords(h: Int, m: Int): String {
    // Write your code here
    val nums = arrayOf(
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
        "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
        "twenty six", "twenty seven", "twenty eight", "twenty nine"
    )

    return when {
        m == 0 -> "${nums[h]} o' clock"
        m == 1 -> "one minute past ${nums[h]}"
        m == 15 -> "quarter past ${nums[h]}"
        m == 30 -> "half past ${nums[h]}"
        m == 45 -> "quarter to ${nums[h + 1]}"
        m == 59 -> "one minute to ${nums[h + 1]}"
        m < 30 -> if (m == 15) "quarter past ${nums[h]}" else if (m < 20) "${nums[m]} minutes past ${nums[h]}" else "${nums[20]} ${nums[m - 20]} minutes past ${nums[h]}"
        else -> if (60 - m == 15) "quarter to ${nums[h + 1]}" else if (60 - m < 20) "${nums[60 - m]} minutes to ${nums[h + 1]}" else "${nums[20]} ${nums[60 - m - 20]} minutes to ${nums[h + 1]}"
    }
}

fun main(args: Array<String>) {
    val h = readLine()!!.trim().toInt()

    val m = readLine()!!.trim().toInt()

    val result = timeInWords(h, m)

    println(result)
}
