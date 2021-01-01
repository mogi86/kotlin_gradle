package example.sequences

// see: https://kotlinlang.org/docs/reference/sequences.html
class Sequences {
    companion object {
        fun checkBehavior() {
            val seq = sequenceOf(6, 3, 5, 1, 2, 9)

            val list = seq.filter { println("filter: $it"); it >= 5 }
                .map { println("* 10: ${it * 10}"); it * 10 }
                .take(2)

            println(".....")
            println(list.toList())
        }
    }
}
