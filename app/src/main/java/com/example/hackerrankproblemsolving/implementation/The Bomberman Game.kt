package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'bomberMan' function below.
 *
 * The function is expected to return a STRING_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. STRING_ARRAY grid
 */

fun bomberMan(n: Int, grid: Array<String>): Array<String> {
    // Write your code here
    if (n == 0 || n == 1) return grid

    val r = grid.size
    val c = grid[0].length
    var currentGrid = grid.map { it.toCharArray() }.toTypedArray()

    fun detonate(grid: Array<CharArray>): Array<CharArray> {
        val newGrid = Array(r) { CharArray(c) { 'O' } }
        val directions = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

        for (i in 0 until r) {
            for (j in 0 until c) {
                if (grid[i][j] == 'O') {
                    newGrid[i][j] = '.'
                    for ((di, dj) in directions) {
                        val ni = i + di
                        val nj = j + dj
                        if (ni in 0 until r && nj in 0 until c) {
                            newGrid[ni][nj] = '.'
                        }
                    }
                }
            }
        }
        return newGrid
    }


    if (n % 4 == 3) {
        return detonate(currentGrid).map { it.concatToString() }.toTypedArray()
    }

    if (n % 4 == 1) {
        currentGrid = detonate(currentGrid)
        return detonate(currentGrid).map { it.concatToString() }.toTypedArray()
    }

    return Array(r) { "O".repeat(c) }
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val r = first_multiple_input[0].toInt()

    val c = first_multiple_input[1].toInt()

    val n = first_multiple_input[2].toInt()

    val grid = Array<String>(r, { "" })
    for (i in 0 until r) {
        val gridItem = readLine()!!
        grid[i] = gridItem
    }

    val result = bomberMan(n, grid)

    println(result.joinToString("\n"))
}
