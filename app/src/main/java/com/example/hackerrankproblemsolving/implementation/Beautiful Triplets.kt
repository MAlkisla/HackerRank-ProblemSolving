package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'beautifulTriplets' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER d
 *  2. INTEGER_ARRAY arr
 */

fun beautifulTriplets(d: Int, arr: Array<Int>): Int {
    // Write your code here
    val valueToIndices = mutableMapOf<Int, MutableList<Int>>()
    var count = 0

    for ((index, value) in arr.withIndex()) {
        valueToIndices.getOrPut(value) { mutableListOf() }.add(index)
    }

    for ((index, value) in arr.withIndex()) {
        val second = value + d
        val third = value + 2 * d

        if (valueToIndices.containsKey(second) && valueToIndices.containsKey(third)) {
            val secondIndices = valueToIndices[second]!!
            val thirdIndices = valueToIndices[third]!!

            val validSecondIndices = secondIndices.count { it > index }
            val validThirdIndices = thirdIndices.count { it > secondIndices.last() }

            count += validSecondIndices * validThirdIndices
        }
    }

    return count
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = beautifulTriplets(d, arr)

    println(result)
}
