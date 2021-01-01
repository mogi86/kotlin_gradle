package example

import example.data.*
import example.sequences.Sequences

fun main() {
    val human = Human("Taro", 20)

    println(human.toString())

    println(System.getProperty("java.version"))

    // Sequences
    Sequences.checkBehavior()
}
