package com.example.hackerrankproblemsolving.warmup

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var primaryDiagonalSum = 0
    var secondaryDiagonalSum = 0
    val n = arr.size

    for (i in 0 until n) {
        primaryDiagonalSum += arr[i][i]
        secondaryDiagonalSum += arr[i][n - i - 1]
    }

    return Math.abs(primaryDiagonalSum - secondaryDiagonalSum)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
