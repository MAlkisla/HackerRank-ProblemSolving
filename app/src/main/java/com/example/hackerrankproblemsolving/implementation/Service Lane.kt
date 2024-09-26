package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'serviceLane' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY cases
 */

fun serviceLane(n: Int, width: IntArray, cases: Array<IntArray>): IntArray {
    val results = IntArray(cases.size)

    for ((index, case) in cases.withIndex()) {
        val (start, end) = case
        results[index] = width.sliceArray(start..end).minOrNull() ?: -1
    }

    return results
}

fun main() {
    val firstMultipleInput = readLine()!!.trimEnd().split(" ")
    val n = firstMultipleInput[0].toInt()
    val t = firstMultipleInput[1].toInt()

    val width = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toIntArray()

    val cases = Array(t) {
        readLine()!!.trimEnd().split(" ").map { it.toInt() }.toIntArray()
    }

    val result = serviceLane(n, width, cases)

    result.forEach { println(it) }
}
