package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'almostSorted' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun almostSorted(arr: Array<Int>): Unit {
    // Write your code here
    if (arr.contentEquals(arr.sortedArray())) {
        println("yes")
        return
    }

    val n = arr.size
    val sorted = arr.sorted()
    val diffs = mutableListOf<Int>()

    for (i in arr.indices) {
        if (arr[i] != sorted[i]) {
            diffs.add(i)
        }
    }

    if (diffs.size == 2) {
        println("yes")
        println("swap ${diffs[0] + 1} ${diffs[1] + 1}")
        return
    }

    if (diffs.size > 2) {
        val subArray = arr.slice(diffs.first()..diffs.last()).toIntArray()
        if (subArray.contentEquals(subArray.sortedArray().reversedArray())) {
            println("yes")
            println("reverse ${diffs.first() + 1} ${diffs.last() + 1}")
            return
        }
    }

    println("no")
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    almostSorted(arr)
}
