package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'queensAttack' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 *  3. INTEGER r_q
 *  4. INTEGER c_q
 *  5. 2D_INTEGER_ARRAY obstacles
 */

fun queensAttack(n: Int, k: Int, r_q: Int, c_q: Int, obstacles: Array<Array<Int>>): Int {
    // Write your code here
    val obstaclesMap = mutableMapOf<Int, MutableSet<Int>>()
    for (obstacle in obstacles) {
        obstaclesMap.getOrPut(obstacle[0], ::mutableSetOf).add(obstacle[1])
    }

    var count = 0
    val directions = arrayOf(
        -1 to 0, 1 to 0, 0 to -1, 0 to 1,
        -1 to -1, -1 to 1, 1 to -1, 1 to 1
    )

    directions.forEach { (dr, dc) ->
        var step = 1
        while (true) {
            val newRow = r_q + step * dr
            val newCol = c_q + step * dc
            if (newRow <= 0 || newRow > n || newCol <= 0 || newCol > n ||
                obstaclesMap[newRow]?.contains(newCol) == true) {
                break
            }
            count++
            step++
        }
    }

    return count
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val r_q = second_multiple_input[0].toInt()

    val c_q = second_multiple_input[1].toInt()

    val obstacles = Array<Array<Int>>(k, { Array<Int>(2, { 0 }) })

    for (i in 0 until k) {
        obstacles[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = queensAttack(n, k, r_q, c_q, obstacles)

    println(result)
}
