package example

import example.basic.Sub
import example.classes.Sample
import example.data.*
import example.scope.Animal
import example.sequences.Sequences

fun main() {
    println("[Start]")

    val human = Human("Taro", 20)

    println("----------------------")
    println(human.toString())

    println("----------------------")
    println(System.getProperty("java.version"))

    // Sequences
    println("----------------------")
    println("[Sequences]")
    println("----------------------")
    Sequences.checkBehavior()

    println("----------------------")
    println("[Class]")
    println("----------------------")
    val sample = Sample("Ken")
    println("----------------------")
    println(sample.toString())

    println("----------------------")
    Sub()

    // Scope function
    println("----------------------")
    println("[Scope function]")
    println("----------------------")
    Animal("Dog", "wataame", 1).let {
        println(it.toString())
        it.changeName("mofumofu")
        it.incrementAge()
        println(it.toString())
    }

    println("----------------------")
    println("[End]")
}
