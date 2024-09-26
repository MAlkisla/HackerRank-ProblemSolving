package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'permutationEquation' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY p as parameter.
 */

fun permutationEquation(p: Array<Int>): Array<Int> {
    // Write your code here
    val n = p.size
    val result = Array(n) { 0 }
    val index = IntArray(n + 1) { 0 }

    for (i in p.indices) {
        index[p[i]] = i + 1
    }

    for (x in 1..n) {
        result[x - 1] = index[index[x]]
    }

    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = permutationEquation(p)

    println(result.joinToString("\n"))
}
