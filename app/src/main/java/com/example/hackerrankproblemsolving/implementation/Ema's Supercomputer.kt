package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'twoPluses' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING_ARRAY grid as parameter.
 */

fun twoPluses(grid: Array<String>): Int {
    // Write your code here
    val n = grid.size
    val m = grid[0].length
    val pluses = mutableListOf<Triple<Int, Int, Int>>() // List to store (row, col, arm length)

    for (i in 0 until n) {
        for (j in 0 until m) {
            var armLength = 0
            while (true) {
                if (i - armLength < 0 || i + armLength >= n || j - armLength < 0 || j + armLength >= m ||
                    grid[i - armLength][j] != 'G' || grid[i + armLength][j] != 'G' ||
                    grid[i][j - armLength] != 'G' || grid[i][j + armLength] != 'G'
                ) break
                pluses.add(Triple(i, j, armLength))
                armLength++
            }
        }
    }

    var maxProduct = 0

    for (p1 in pluses) {
        for (p2 in pluses) {
            if (!overlap(p1, p2, grid)) {
                val area1 = 1 + 4 * p1.third
                val area2 = 1 + 4 * p2.third
                maxProduct = maxOf(maxProduct, area1 * area2)
            }
        }
    }

    return maxProduct
}

fun overlap(p1: Triple<Int, Int, Int>, p2: Triple<Int, Int, Int>, grid: Array<String>): Boolean {
    val cells1 = generateCells(p1)
    val cells2 = generateCells(p2)
    for (cell1 in cells1) {
        for (cell2 in cells2) {
            if (cell1.first == cell2.first && cell1.second == cell2.second) return true
        }
    }
    return false
}

fun generateCells(plus: Triple<Int, Int, Int>): List<Pair<Int, Int>> {
    val (row, col, arm) = plus
    val cells = mutableListOf<Pair<Int, Int>>()
    cells.add(Pair(row, col))
    for (i in 1..arm) {
        cells.add(Pair(row - i, col))
        cells.add(Pair(row + i, col))
        cells.add(Pair(row, col - i))
        cells.add(Pair(row, col + i))
    }
    return cells
}


fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val grid = Array<String>(n, { "" })
    for (i in 0 until n) {
        val gridItem = readLine()!!
        grid[i] = gridItem
    }

    val result = twoPluses(grid)

    println(result)
}
