package example.standard.library

import example.data.Human

// see: https://kotlinlang.org/api/latest/jvm/stdlib/
//
// In this Class, confirm the behavior of Standard Library.
// However there are a lot of libraries.
// Therefore, excerpt a few libraries from them to confirm.
class Library {
    companion object {
        // see: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/partition.html
        fun divideToTwoList(humans: List<Human>, age: Int): Pair<List<Human>, List<Human>> {
            return humans.partition { it.age < age }
        }
    }
}
