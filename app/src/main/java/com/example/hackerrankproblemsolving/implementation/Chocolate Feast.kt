package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'chocolateFeast' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER c
 *  3. INTEGER m
 */

fun chocolateFeast(n: Int, c: Int, m: Int): Int {
    // Write your code here
    var chocolates = n / c
    var wrappers = chocolates

    while (wrappers >= m) {
        val additionalChocolates = wrappers / m
        chocolates += additionalChocolates
        wrappers = wrappers % m + additionalChocolates
    }

    return chocolates
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val c = first_multiple_input[1].toInt()

        val m = first_multiple_input[2].toInt()

        val result = chocolateFeast(n, c, m)

        println(result)
    }
}
