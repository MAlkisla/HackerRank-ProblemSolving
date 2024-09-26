package com.example.hackerrankproblemsolving.implementation

import java.math.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'extraLongFactorials' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun extraLongFactorials(n: Int): Unit {
    // Write your code here
    var factorial = BigInteger.ONE
    for (i in 1..n) {
        factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
    }
    println(factorial)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    extraLongFactorials(n)
}
