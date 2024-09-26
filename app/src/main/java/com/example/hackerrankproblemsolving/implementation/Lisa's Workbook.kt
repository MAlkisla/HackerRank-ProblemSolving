package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'workbook' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 *  3. INTEGER_ARRAY arr
 */

fun workbook(n: Int, k: Int, arr: Array<Int>): Int {
    // Write your code here
    var specialProblems = 0
    var currentPage = 1

    for (problemsInChapter in arr) {
        var problemNumber = 1

        while (problemsInChapter >= problemNumber) {
            val pageStart = problemNumber
            val pageEnd = minOf(pageStart + k - 1, problemsInChapter)

            if (currentPage in pageStart..pageEnd) {
                specialProblems++
            }

            problemNumber += k
            currentPage++
        }
    }

    return specialProblems
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = workbook(n, k, arr)

    println(result)
}
