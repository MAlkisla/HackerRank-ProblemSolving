package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'gridSearch' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING_ARRAY G
 *  2. STRING_ARRAY P
 */

fun gridSearch(G: Array<String>, P: Array<String>): String {
    // Write your code here
    val R = G.size
    val C = G[0].length
    val r = P.size
    val c = P[0].length

    for (i in 0..R-r) {
        for (j in 0..C-c) {
            var found = true
            for (pi in 0 until r) {

                if (!G[i + pi].substring(j, j + c).equals(P[pi])) {
                    found = false
                    break
                }
            }

            if (found) return "YES"
        }
    }
    return "NO"
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val R = first_multiple_input[0].toInt()

        val C = first_multiple_input[1].toInt()

        val G = Array<String>(R, { "" })
        for (i in 0 until R) {
            val GItem = readLine()!!
            G[i] = GItem
        }

        val second_multiple_input = readLine()!!.trimEnd().split(" ")

        val r = second_multiple_input[0].toInt()

        val c = second_multiple_input[1].toInt()

        val P = Array<String>(r, { "" })
        for (i in 0 until r) {
            val PItem = readLine()!!
            P[i] = PItem
        }

        val result = gridSearch(G, P)

        println(result)
    }
}
