package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'organizingContainers' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts 2D_INTEGER_ARRAY container as parameter.
 */

fun organizingContainers(container: Array<Array<Int>>): String {
    // Write your code here
    val n = container.size
    val rowSums = IntArray(n) { 0 }
    val colSums = IntArray(n) { 0 }

    for (i in 0 until n) {
        for (j in 0 until n) {
            rowSums[i] += container[i][j]
            colSums[j] += container[i][j]
        }
    }

    rowSums.sort()
    colSums.sort()

    for (i in 0 until n) {
        if (rowSums[i] != colSums[i]) {
            return "Impossible"
        }
    }

    return "Possible"
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val n = readLine()!!.trim().toInt()

        val container = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

        for (i in 0 until n) {
            container[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
        }

        val result = organizingContainers(container)

        println(result)
    }
}
