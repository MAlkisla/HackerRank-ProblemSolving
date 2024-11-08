package com.example.hackerrankproblemsolving.implementation

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>, k: Int): Int {
    var energy = 100
    var i = 0

    do {
        i = (i + k) % c.size
        energy -= 1
        if (c[i] == 1) {
            energy -= 2
        }
    } while (i != 0)

    return energy

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c, k)

    println(result)
}
