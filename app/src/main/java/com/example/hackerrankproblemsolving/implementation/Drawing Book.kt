package com.example.hackerrankproblemsolving.implementation

import kotlin.comparisons.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'pageCount' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER p
 */

fun pageCount(n: Int, p: Int): Int {
    // Write your code here
    val turnsFromStart = p / 2

    val turnsFromEnd = if (n % 2 == 0) {
        (n - p + 1) / 2
    } else {
        (n - p) / 2
    }

    return minOf(turnsFromStart, turnsFromEnd)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trim().toInt()

    val result = pageCount(n, p)

    println(result)
}
