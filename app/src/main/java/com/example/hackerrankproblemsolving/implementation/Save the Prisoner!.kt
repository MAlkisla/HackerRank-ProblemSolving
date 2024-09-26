package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'saveThePrisoner' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER m
 *  3. INTEGER s
 */

fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    // Write your code here
    return ((s + m - 2) % n) + 1
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val m = first_multiple_input[1].toInt()

        val s = first_multiple_input[2].toInt()

        val result = saveThePrisoner(n, m, s)

        println(result)
    }
}
