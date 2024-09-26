package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'libraryFine' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER d1
 *  2. INTEGER m1
 *  3. INTEGER y1
 *  4. INTEGER d2
 *  5. INTEGER m2
 *  6. INTEGER y2
 */

fun libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int {
    // Write your code here
    if (y1 > y2) return 10000

    if (y1 == y2 && m1 > m2) return (m1 - m2) * 500

    if (y1 == y2 && m1 == m2 && d1 > d2) return (d1 - d2) * 15

    return 0
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val d1 = first_multiple_input[0].toInt()

    val m1 = first_multiple_input[1].toInt()

    val y1 = first_multiple_input[2].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val d2 = second_multiple_input[0].toInt()

    val m2 = second_multiple_input[1].toInt()

    val y2 = second_multiple_input[2].toInt()

    val result = libraryFine(d1, m1, y1, d2, m2, y2)

    println(result)
}
