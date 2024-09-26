package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'minimumDistances' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun minimumDistances(a: Array<Int>): Int {
    // Write your code here
    val lastIndexMap = mutableMapOf<Int, Int>()
    var minDistance = Int.MAX_VALUE
    var found = false

    a.forEachIndexed { index, value ->
        if (lastIndexMap.containsKey(value)) {
            val distance = index - lastIndexMap[value]!!
            if (distance < minDistance) {
                minDistance = distance
                found = true
            }
        }
        lastIndexMap[value] = index
    }

    return if (found) minDistance else -1
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = minimumDistances(a)

    println(result)
}
