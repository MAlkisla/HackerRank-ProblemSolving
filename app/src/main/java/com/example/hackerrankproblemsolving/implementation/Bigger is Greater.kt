package com.example.hackerrankproblemsolving.implementation

import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'biggerIsGreater' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING w as parameter.
 */

fun biggerIsGreater(w: String): String {
    // Write your code here
    val chars = w.toCharArray()
    var pivot = -1

    for (i in chars.size - 2 downTo 0) {
        if (chars[i] < chars[i + 1]) {
            pivot = i
            break
        }
    }

    if (pivot == -1) return "no answer"

    var j = chars.size - 1
    while (chars[pivot] >= chars[j]) {
        j--
    }

    chars[pivot] = chars[j].also { chars[j] = chars[pivot] }

    var start = pivot + 1
    var end = chars.size - 1
    while (start < end) {
        chars[start] = chars[end].also { chars[end] = chars[start] }
        start++
        end--
    }

    return String(chars)
}

fun main(args: Array<String>) {
    val T = readLine()!!.trim().toInt()

    for (TItr in 1..T) {
        val w = readLine()!!

        val result = biggerIsGreater(w)

        println(result)
    }
}
