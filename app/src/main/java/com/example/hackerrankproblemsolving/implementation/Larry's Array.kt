package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'larrysArray' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER_ARRAY A as parameter.
 */

fun larrysArray(A: Array<Int>): String {
    // Write your code here
    fun countInversions(array: Array<Int>): Int {
        var inversions = 0
        for (i in array.indices) {
            for (j in i + 1 until array.size) {
                if (array[i] > array[j]) inversions++
            }
        }
        return inversions
    }

    return if (countInversions(A) % 2 == 0) "YES" else "NO"
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val A = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val result = larrysArray(A)

        println(result)
    }
}
