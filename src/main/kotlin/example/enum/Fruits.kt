package example.enum

// see: https://kotlinlang.org/docs/reference/enum-classes.html
//
// Each Enum constant is object.
// Constructor can have argument, and each Enum object can be initialized by passing the argument,
enum class Fruits(val code: Int) {
    APPLE(1) {
        override fun printName(): String {
            return "name=apple"
        }
    },

    ORANGE(2) {
        override fun printName(): String {
            return "name=orange"
        }
    },

    PEACH(3) {
        override fun printName(): String {
            return "name=peach"
        }
    };

    abstract fun printName(): String
}
