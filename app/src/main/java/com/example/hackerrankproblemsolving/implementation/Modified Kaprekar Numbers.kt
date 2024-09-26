package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'kaprekarNumbers' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER p
 *  2. INTEGER q
 */

fun kaprekarNumbers(p: Int, q: Int): Unit {
    // Write your code here
    var found = false
    for (n in p..q) {
        val nSquare = n.toLong() * n.toLong()
        val s = nSquare.toString()
        val len = s.length
        val leftPart = if (len > 1) s.substring(0, len / 2).toInt() else 0
        val rightPart = s.substring(len / 2).toInt()
        if (leftPart + rightPart == n) {
            if (found) print(" ")
            print(n)
            found = true
        }
    }
    if (!found) print("INVALID RANGE")
}

fun main(args: Array<String>) {
    val p = readLine()!!.trim().toInt()

    val q = readLine()!!.trim().toInt()

    kaprekarNumbers(p, q)
}
