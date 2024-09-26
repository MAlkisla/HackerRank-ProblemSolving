package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'cavityMap' function below.
 *
 * The function is expected to return a STRING_ARRAY.
 * The function accepts STRING_ARRAY grid as parameter.
 */

fun cavityMap(grid: Array<String>): Array<String> {
    // Write your code here
    val gridChars = grid.map { it.toCharArray() }.toTypedArray()

    val n = grid.size
    val result = Array(n) { grid[it].toCharArray() }

    for (i in 1 until n - 1) {
        for (j in 1 until n - 1) {
            val current = gridChars[i][j]
            if (current > gridChars[i - 1][j] && current > gridChars[i + 1][j] &&
                current > gridChars[i][j - 1] && current > gridChars[i][j + 1]) {
                result[i][j] = 'X'
            }
        }
    }

    return Array(n) { String(result[it]) }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val grid = Array<String>(n, { "" })
    for (i in 0 until n) {
        val gridItem = readLine()!!
        grid[i] = gridItem
    }

    val result = cavityMap(grid)

    println(result.joinToString("\n"))
}
