package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'encryption' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun encryption(s: String): String {
    // Write your code here
    val input = s.filter { !it.isWhitespace() }
    val L = input.length
    var rows = Math.floor(Math.sqrt(L.toDouble())).toInt()
    var cols = Math.ceil(Math.sqrt(L.toDouble())).toInt()

    if (rows * cols < L) {
        rows = cols
    }

    val output = StringBuilder()
    for (col in 0 until cols) {
        for (row in 0 until rows) {
            val index = row * cols + col
            if (index < L) {
                output.append(input[index])
            }
        }
        if (col < cols - 1) output.append(' ')
    }

    return output.toString()
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = encryption(s)

    println(result)
}
