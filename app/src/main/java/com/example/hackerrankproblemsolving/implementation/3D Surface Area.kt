package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'surfaceArea' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY A as parameter.
 */

fun surfaceArea(A: Array<Array<Int>>): Int {
    // Write your code here
    val h = A.size
    val w = A[0].size
    var area = 0

    for (i in 0 until h) {
        for (j in 0 until w) {
            // Top and bottom surface area
            area += 2

            // North side or top boundary of the grid
            area += if (i == 0) A[i][j] else Math.max(A[i][j] - A[i - 1][j], 0)

            // South side or bottom boundary of the grid
            area += if (i == h - 1) A[i][j] else Math.max(A[i][j] - A[i + 1][j], 0)

            // West side or left boundary of the grid
            area += if (j == 0) A[i][j] else Math.max(A[i][j] - A[i][j - 1], 0)

            // East side or right boundary of the grid
            area += if (j == w - 1) A[i][j] else Math.max(A[i][j] - A[i][j + 1], 0)
        }
    }

    return area
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val H = first_multiple_input[0].toInt()

    val W = first_multiple_input[1].toInt()

    val A = Array<Array<Int>>(H, { Array<Int>(W, { 0 }) })

    for (i in 0 until H) {
        A[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = surfaceArea(A)

    println(result)
}
