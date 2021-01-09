package example

import example.basic.Sub
import example.classes.Sample
import example.data.*
import example.enum.Fruits
import example.scope.Animal
import example.scope.Animal2
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
    val dog = Animal("Dog", "wataame", 1).let {
        println(it.toString())
        it.changeName("mofumofu")
        it.incrementAge()
        println(it.toString())
    }
    println(dog.toString()) // output: kotlin.Unit
    println("----------------------")
    // Context object: this or it
    // see: https://kotlinlang.org/docs/reference/scope-functions.html#context-object-this-or-it
    // this
    val cat = Animal2("Cat").apply {
        name = "king"
        age = 2
    }
    println(cat.toString()) // output: Animal2(kind=Cat, name=king, age=2)
    println("----------------------")
    // it
    val cat2 = Animal("Cat", "hachiko", 3).also {
        // Having the context object as it is better
        // when the object is mostly used as an argument in function (e.g. print log) calls.
        println("also: $it")
    }
    println(cat2.toString()) // output: Animal(kind=Cat, name=hachiko, age=3)
    // Return Value
    // see: https://kotlinlang.org/docs/reference/scope-functions.html#return-value
    //   apply and also return the context object.
    //     ("apply"' output already confirmed above.)
    //   let, run, and with return the lambda result
    println("----------------------")
    val name = Animal("Dog", "wataame", 1).let {
        it.changeName("mofumofu")
        it.incrementAge()
        it.name
    }
    println("output of let: $name")

    // Enum Class
    println("----------------------")
    println("[Enum Class]")
    println("----------------------")
    val fruits = Fruits.APPLE
    println(fruits)
    println(Fruits.values())
    println(Fruits.valueOf("APPLE").printName())

    println("----------------------")
    println("[End]")
}
