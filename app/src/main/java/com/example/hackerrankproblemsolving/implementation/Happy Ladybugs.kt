package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'happyLadybugs' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING b as parameter.
 */

fun happyLadybugs(b: String): String {
    // Write your code here
    val count = IntArray(26)
    var hasEmpty = false

    for (char in b) {
        if (char == '_') {
            hasEmpty = true
        } else {
            count[char - 'A']++
        }
    }

    for (i in count) {
        if (i == 1) return "NO"
    }

    if (hasEmpty) return "YES"

    for (i in 1 until b.length - 1) {
        if (b[i] != b[i - 1] && b[i] != b[i + 1]) {
            return "NO"
        }
    }
    if (b[0] != b[1] || b[b.length - 1] != b[b.length - 2]) {
        return "NO"
    }

    return "YES"
}

fun main(args: Array<String>) {
    val g = readLine()!!.trim().toInt()

    for (gItr in 1..g) {
        val n = readLine()!!.trim().toInt()

        val b = readLine()!!

        val result = happyLadybugs(b)

        println(result)
    }
}
