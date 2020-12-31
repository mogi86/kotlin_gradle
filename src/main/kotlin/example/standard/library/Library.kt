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

        // function for Comparison
        fun compare(): Boolean {
            val coordinate1 = Coordinate(3, 4)
            val coordinate2 = Coordinate(2, 7)

            // same as "return coordinate1.compareTo(coordinate2) < 0"
            return coordinate1 < coordinate2
        }
    }

    // Comparable
    // see: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/
    //
    // When use Comparable, can compare between 2 objects.
    data class Coordinate(val x: Int, val y: Int): Comparable<Coordinate> {
        override fun compareTo(other: Coordinate): Int {
            return (x * y) - (other.x * other.y)
        }
    }
}
