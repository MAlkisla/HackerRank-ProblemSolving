package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'strangeCounter' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER t as parameter.
 */

fun strangeCounter(t: Long): Long {
    // Write your code here
    var time = 1L
    var value = 3L
    while (time + value <= t) {
        time += value
        value *= 2
    }

    return value - (t - time)
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toLong()

    val result = strangeCounter(t)

    println(result)
}
