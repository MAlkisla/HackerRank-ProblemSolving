package com.example.hackerrankproblemsolving.warmup

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    val sortedArr = arr.sorted()
    val minSum = sortedArr.take(4).sumOf { it.toLong() }
    val maxSum = sortedArr.takeLast(4).sumOf { it.toLong() }
    println("$minSum $maxSum")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
