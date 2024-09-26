package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'nonDivisibleSubset' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY s
 */

fun nonDivisibleSubset(k: Int, s: Array<Int>): Int {
    // Write your code here
    val remainders = IntArray(k) { 0 }

    for (number in s) {
        remainders[number % k]++
    }

    var subsetSize = 0

    if (k % 2 == 0 && remainders[k / 2] > 0) {
        subsetSize++
    }

    if (remainders[0] > 0) {
        subsetSize++
    }

    for (i in 1 until (k / 2) + 1) {
        if (i != k - i) {
            subsetSize += maxOf(remainders[i], remainders[k - i])
        }
    }

    return subsetSize
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = nonDivisibleSubset(k, s)

    println(result)
}
