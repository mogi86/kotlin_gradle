package example.basic

import java.util.*

// In this class, confirm the behavior of deriving class initialization order.
//
// see: https://kotlinlang.org/docs/reference/classes.html#derived-class-initialization-order
//
// The output result will look like below.
//
//   Parent class init
//   Child class init
open class Sample2 {
    init {
        println("Parent class init")
    }
}

class Sub: Sample2() {
    init {
        println("Child class init")
    }
}
