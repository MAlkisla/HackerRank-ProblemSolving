package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'absolutePermutation' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 */

fun absolutePermutation(n: Int, k: Int): Array<Int> {
    // Write your code here
    if (k == 0) {
        return Array(n) { it + 1 }
    }

    if (n % (2*k) != 0) return arrayOf(-1)

    val result = Array(n) { 0 }
    var add = true

    for (i in 1..n) {
        result[i-1] = if (add) i + k else i - k
        if (i % k == 0) add = !add
    }

    return result
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val k = first_multiple_input[1].toInt()

        val result = absolutePermutation(n, k)

        println(result.joinToString(" "))
    }
}
