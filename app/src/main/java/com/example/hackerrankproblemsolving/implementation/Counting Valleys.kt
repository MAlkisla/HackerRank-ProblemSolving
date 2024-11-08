package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var valleys = 0
    var level = 0
    var inValley = false

    for (step in path) {
        if (step == 'U') {
            level++
        } else {
            level--
        }

        if (!inValley && level < 0) {
            inValley = true
        }

        if (inValley && level == 0) {
            valleys++
            inValley = false
        }
    }

    return valleys

}

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}
