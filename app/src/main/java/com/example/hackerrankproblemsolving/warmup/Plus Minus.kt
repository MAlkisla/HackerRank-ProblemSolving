package com.example.hackerrankproblemsolving.warmup

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    val total = arr.size.toDouble()
    val positiveCount = arr.count { it > 0 }
    val negativeCount = arr.count { it < 0 }
    val zeroCount = arr.count { it == 0 }

    println("%.6f".format(positiveCount / total))
    println("%.6f".format(negativeCount / total))
    println("%.6f".format(zeroCount / total))
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
