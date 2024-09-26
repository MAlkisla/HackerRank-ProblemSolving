package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'appendAndDelete' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. STRING t
 *  3. INTEGER k
 */

fun appendAndDelete(s: String, t: String, k: Int): String {
    // Write your code here
    val commonLength = s.zip(t).takeWhile { it.first == it.second }.count()

    val deleteCount = s.length - commonLength
    val appendCount = t.length - commonLength
    val totalOperations = deleteCount + appendCount

    return when {
        totalOperations == k -> "Yes"
        totalOperations < k && (k - totalOperations) % 2 == 0 -> "Yes"
        totalOperations < k && (s.length + t.length) <= k -> "Yes"
        else -> "No"
    }
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val t = readLine()!!

    val k = readLine()!!.trim().toInt()

    val result = appendAndDelete(s, t, k)

    println(result)
}
