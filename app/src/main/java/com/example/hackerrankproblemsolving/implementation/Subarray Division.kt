package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 */

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var ways = 0
    var sum = 0

    if (s.size >= m) {
        for (i in 0 until m) {
            sum += s[i]
        }
    }

    if (sum == d) {
        ways++
    }

    for (i in 1..s.size - m) {
        sum = sum - s[i - 1] + s[i + m - 1]
        if (sum == d) {
            ways++
        }
    }

    return ways
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val d = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
