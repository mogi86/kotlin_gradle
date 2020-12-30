package example.basic

class Basic {
    companion object {
        fun isString(value: Any): Boolean {
            // Can use "is" word
            return value is String
        }
    }
}
