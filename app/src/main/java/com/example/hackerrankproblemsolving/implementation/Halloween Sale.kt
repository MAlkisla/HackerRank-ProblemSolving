package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'howManyGames' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER p
 *  2. INTEGER d
 *  3. INTEGER m
 *  4. INTEGER s
 */

fun howManyGames(p: Int, d: Int, m: Int, s: Int): Int {
    // Return the number of games you can buy
    var currentPrice = p
    var totalSpent = 0
    var gamesBought = 0

    while (totalSpent + currentPrice <= s) {
        gamesBought++
        totalSpent += currentPrice
        if (currentPrice - d > m) {
            currentPrice -= d
        } else {
            currentPrice = m
        }
    }

    return gamesBought
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val p = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val m = first_multiple_input[2].toInt()

    val s = first_multiple_input[3].toInt()

    val answer = howManyGames(p, d, m, s)

    println(answer)
}
