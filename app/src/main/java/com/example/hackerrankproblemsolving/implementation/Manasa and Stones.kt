package com.example.hackerrankproblemsolving.implementation

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'stones' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER a
 *  3. INTEGER b
 */

fun stones(n: Int, a: Int, b: Int): Array<Int> {
    // Write your code here
    val results = TreeSet<Int>()

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i + j == n - 1) {
                results.add(a * i + b * j)
            }
        }
    }

    return results.toArray(arrayOf())
}

fun main(args: Array<String>) {
    val T = readLine()!!.trim().toInt()

    for (TItr in 1..T) {
        val n = readLine()!!.trim().toInt()

        val a = readLine()!!.trim().toInt()

        val b = readLine()!!.trim().toInt()

        val result = stones(n, a, b)

        println(result.joinToString(" "))
    }
}
