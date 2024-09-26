package com.example.hackerrankproblemsolving.warmup

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {
    // Write your code here
    for (i in 1..n) {
        val spaces = n - i
        val hashes = i
        println(" ".repeat(spaces) + "#".repeat(hashes))
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}
