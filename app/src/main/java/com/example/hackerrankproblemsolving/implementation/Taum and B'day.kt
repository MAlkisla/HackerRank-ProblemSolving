package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'taumBday' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER b
 *  2. INTEGER w
 *  3. INTEGER bc
 *  4. INTEGER wc
 *  5. INTEGER z
 */

fun taumBday(b: Int, w: Int, bc: Int, wc: Int, z: Int): Long {
    // Write your code here
    val bL = b.toLong()
    val wL = w.toLong()
    val bcL = bc.toLong()
    val wcL = wc.toLong()
    val zL = z.toLong()

    val directBlack = bL * bcL
    val directWhite = wL * wcL

    val convertBlack = bL * (wcL + zL)
    val convertWhite = wL * (bcL + zL)

    val minBlackCost = Math.min(directBlack, convertBlack)
    val minWhiteCost = Math.min(directWhite, convertWhite)

    return minBlackCost + minWhiteCost
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val b = first_multiple_input[0].toInt()

        val w = first_multiple_input[1].toInt()

        val second_multiple_input = readLine()!!.trimEnd().split(" ")

        val bc = second_multiple_input[0].toInt()

        val wc = second_multiple_input[1].toInt()

        val z = second_multiple_input[2].toInt()

        val result = taumBday(b, w, bc, wc, z)

        println(result)
    }
}
