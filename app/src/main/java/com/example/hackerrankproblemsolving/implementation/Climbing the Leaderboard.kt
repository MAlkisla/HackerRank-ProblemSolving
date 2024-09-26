package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'climbingLeaderboard' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY ranked
 *  2. INTEGER_ARRAY player
 */

fun climbingLeaderboard(ranked: Array<Int>, player: Array<Int>): Array<Int> {
    val result = Array(player.size) { 0 }
    val distinctScores = ranked.distinct().toIntArray()
    var index = distinctScores.size - 1

    for (i in player.indices) {
        while (index >= 0 && player[i] >= distinctScores[index]) {
            index--
        }
        result[i] = index + 2
    }

    return result
}

fun main(args: Array<String>) {
    val rankedCount = readLine()!!.trim().toInt()

    val ranked = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val playerCount = readLine()!!.trim().toInt()

    val player = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = climbingLeaderboard(ranked, player)

    println(result.joinToString("\n"))
}
