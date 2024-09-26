package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here
    var highest = scores.first()
    var lowest = scores.first()
    var highCount = 0
    var lowCount = 0

    for (score in scores.drop(1)) {
        if (score > highest) {
            highest = score
            highCount++
        } else if (score < lowest) {
            lowest = score
            lowCount++
        }
    }

    return arrayOf(highCount, lowCount)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
