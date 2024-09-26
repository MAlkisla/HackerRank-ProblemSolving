package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'viralAdvertising' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun viralAdvertising(n: Int): Int {
    // Write your code here
    var shared = 5
    var cumulative = 0
    for (day in 1..n) {
        val liked = shared / 2
        cumulative += liked
        shared = liked * 3
    }
    return cumulative
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = viralAdvertising(n)

    println(result)
}
