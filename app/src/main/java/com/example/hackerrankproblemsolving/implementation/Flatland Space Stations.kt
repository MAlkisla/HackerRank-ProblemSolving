package com.example.hackerrankproblemsolving.implementation

import java.util.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the flatlandSpaceStations function below.
fun flatlandSpaceStations(n: Int, c: Array<Int>): Int {
    val hasStation = BooleanArray(n)
    for (station in c) {
        hasStation[station] = true
    }

    var maxDistance = 0

    for (i in 0 until n) {
        if (!hasStation[i]) {
            var distance = Int.MAX_VALUE

            for (j in 0 until n) {
                val index = (i + j) % n
                if (hasStation[index]) {
                    distance = minOf(distance, j)
                    break
                }
            }
            for (j in 0 until n) {
                val index = (i - j + n) % n
                if (hasStation[index]) {
                    distance = minOf(distance, j)
                    break
                }
            }

            maxDistance = maxOf(maxDistance, distance)
        }
    }

    return maxDistance

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = flatlandSpaceStations(n, c)

    println(result)
}
