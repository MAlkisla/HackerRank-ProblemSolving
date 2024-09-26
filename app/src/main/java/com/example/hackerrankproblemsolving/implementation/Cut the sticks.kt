package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'cutTheSticks' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun cutTheSticks(arr: Array<Int>): Array<Int> {
    // Write your code here
    val result = mutableListOf<Int>()
    var currentSticks = arr.sorted().toMutableList()

    while (currentSticks.isNotEmpty()) {
        result.add(currentSticks.size)
        val cutLength = currentSticks[0]

        currentSticks = currentSticks.map { it - cutLength }.filter { it > 0 }.toMutableList()
    }

    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = cutTheSticks(arr)

    println(result.joinToString("\n"))
}
