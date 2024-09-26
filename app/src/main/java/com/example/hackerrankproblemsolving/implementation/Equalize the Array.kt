package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'equalizeArray' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun equalizeArray(arr: Array<Int>): Int {
    // Write your code here
    val frequencyMap = arr.groupingBy { it }.eachCount()

    val maxFrequency = frequencyMap.values.maxOrNull() ?: 0

    return arr.size - maxFrequency
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = equalizeArray(arr)

    println(result)
}
