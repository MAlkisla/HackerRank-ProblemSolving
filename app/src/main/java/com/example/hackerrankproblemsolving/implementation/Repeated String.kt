package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'repeatedString' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. LONG_INTEGER n
 */

fun repeatedString(s: String, n: Long): Long {
    // Write your code here
    val countAInS = s.count { it == 'a' }
    val fullRepeats = n / s.length
    val remainingChars = (n % s.length).toInt()
    val countAInRemainder = s.substring(0, remainingChars).count { it == 'a' }

    return fullRepeats * countAInS + countAInRemainder
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val n = readLine()!!.trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}
