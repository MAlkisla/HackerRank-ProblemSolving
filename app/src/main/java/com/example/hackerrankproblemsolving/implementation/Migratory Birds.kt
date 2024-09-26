package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'migratoryBirds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun migratoryBirds(arr: Array<Int>): Int {
    // Write your code here
    val frequency = arr.groupingBy { it }.eachCount()

    val maxFrequency = frequency.values.maxOrNull() ?: 0

    return frequency.filter { it.value == maxFrequency }.keys.minOrNull() ?: -1
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
