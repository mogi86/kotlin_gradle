package example

import example.classes.Sample
import example.data.*
import example.sequences.Sequences

fun main() {
    val human = Human("Taro", 20)

    println("----------------------")
    println(human.toString())

    println("----------------------")
    println(System.getProperty("java.version"))

    // Sequences
    println("----------------------")
    Sequences.checkBehavior()

    println("----------------------")
    val sample = Sample("Ken")
    println("----------------------")
    println(sample.toString())
}
