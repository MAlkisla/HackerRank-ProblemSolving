package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'squares' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER a
 *  2. INTEGER b
 */

fun squares(a: Int, b: Int): Int {
    // Write your code here
    val sqrtA = Math.ceil(Math.sqrt(a.toDouble())).toInt()
    val sqrtB = Math.floor(Math.sqrt(b.toDouble())).toInt()
    return if (sqrtB >= sqrtA) sqrtB - sqrtA + 1 else 0
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val a = first_multiple_input[0].toInt()

        val b = first_multiple_input[1].toInt()

        val result = squares(a, b)

        println(result)
    }
}
