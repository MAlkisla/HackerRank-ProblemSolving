package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'utopianTree' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun utopianTree(n: Int): Int {
    // Write your code here
    var height = 1
    for (i in 0 until n) {
        if (i % 2 == 0) {
            height *= 2
        } else {
            height += 1
        }
    }
    return height
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val result = utopianTree(n)

        println(result)
    }
}
