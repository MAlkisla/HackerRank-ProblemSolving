package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'fairRations' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER_ARRAY B as parameter.
 */

fun fairRations(B: Array<Int>): String {
    // Write your code here
    var totalLoaves = 0

    for (i in 0 until B.size - 1) {
        if (B[i] % 2 != 0) {
            B[i]++
            B[i + 1]++
            totalLoaves += 2
        }
    }

    if (B.last() % 2 != 0) {
        return "NO"
    }

    return totalLoaves.toString()
}

fun main(args: Array<String>) {
    val N = readLine()!!.trim().toInt()

    val B = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = fairRations(B)

    println(result)
}
