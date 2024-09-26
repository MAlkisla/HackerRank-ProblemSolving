package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>): Int {
    // Write your code here
    a.sort()

    var maxLength = 0
    var start = 0

    for (i in 1 until a.size) {
        if (Math.abs(a[i] - a[start]) > 1) {
            start = i
        }
        maxLength = maxOf(maxLength, i - start + 1)
    }

    return maxLength
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}
