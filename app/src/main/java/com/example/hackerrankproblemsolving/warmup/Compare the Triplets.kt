package com.example.hackerrankproblemsolving.warmup

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var aliceScore = 0
    var bobScore = 0

    for (i in a.indices) {
        if (a[i] > b[i]) {
            aliceScore++
        } else if (a[i] < b[i]) {
            bobScore++
        }
    }

    return arrayOf(aliceScore, bobScore)
}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
