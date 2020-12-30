package example.basic

class Basic {
    companion object {
        fun isString(value: Any): Boolean {
            // Can use "is" word
            return value is String
        }

        fun printList(): String {
            val list = listOf("one", "two", "three")
            var s = ""

            // list can be used in "for loop"
            for (value in list) {
                // can use "+"
                s += "$value "
            }

            return s
        }

        // when expression
        // see: https://kotlinlang.org/docs/reference/basic-syntax.html#using-when-expression
        fun isString2(value: Any): Boolean {
            return when (value) {
                is String -> true
                else -> false
            }
        }
    }
}
