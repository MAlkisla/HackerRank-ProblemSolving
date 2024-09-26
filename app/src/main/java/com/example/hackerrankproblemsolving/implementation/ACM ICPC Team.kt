package com.example.hackerrankproblemsolving.implementation

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'acmTeam' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts STRING_ARRAY topic as parameter.
 */

fun acmTeam(topic: Array<String>): Array<Int> {
    // Write your code here
    val n = topic.size
    var maxTopics = 0
    var teamCount = 0

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            val combinedKnowledge = topic[i].zip(topic[j]) { a, b ->
                if (a == '1' || b == '1') '1' else '0'
            }.count { it == '1' }

            if (combinedKnowledge > maxTopics) {
                maxTopics = combinedKnowledge
                teamCount = 1
            } else if (combinedKnowledge == maxTopics) {
                teamCount++
            }
        }
    }

    return arrayOf(maxTopics, teamCount)
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val topic = Array<String>(n, { "" })
    for (i in 0 until n) {
        val topicItem = readLine()!!
        topic[i] = topicItem
    }

    val result = acmTeam(topic)

    println(result.joinToString("\n"))
}
