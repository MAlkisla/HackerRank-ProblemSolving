package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'matrixRotation' function below.
 *
 * The function accepts following parameters:
 *  1. 2D_INTEGER_ARRAY matrix
 *  2. INTEGER r
 */

fun matrixRotation(matrix: Array<Array<Int>>, r: Int): Unit {
    // Write your code here
    val rows = matrix.size
    val cols = matrix[0].size
    val numLayers = minOf(rows, cols) / 2

    for (layer in 0 until numLayers) {
        val temp = mutableListOf<Int>()
        // Top row
        for (j in layer until cols - layer) temp.add(matrix[layer][j])
        // Right column
        for (i in layer + 1 until rows - layer) temp.add(matrix[i][cols - layer - 1])
        // Bottom row
        for (j in cols - layer - 2 downTo layer) temp.add(matrix[rows - layer - 1][j])
        // Left column
        for (i in rows - layer - 2 downTo layer + 1) temp.add(matrix[i][layer])

        // Rotate the layer
        val rotation = r % temp.size
        val rotated = temp.drop(rotation) + temp.take(rotation)

        // Map rotated content back to the matrix
        var index = 0
        // Top row
        for (j in layer until cols - layer) matrix[layer][j] = rotated[index++]
        // Right column
        for (i in layer + 1 until rows - layer) matrix[i][cols - layer - 1] = rotated[index++]
        // Bottom row
        for (j in cols - layer - 2 downTo layer) matrix[rows - layer - 1][j] = rotated[index++]
        // Left column
        for (i in rows - layer - 2 downTo layer + 1) matrix[i][layer] = rotated[index++]
    }

    // Printing the matrix
    matrix.forEach { row ->
        println(row.joinToString(" "))
    }
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = first_multiple_input[0].toInt()

    val n = first_multiple_input[1].toInt()

    val r = first_multiple_input[2].toInt()

    val matrix = Array<Array<Int>>(m, { Array<Int>(n, { 0 }) })

    for (i in 0 until m) {
        matrix[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    matrixRotation(matrix, r)
}
