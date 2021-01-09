package example.extension

// see: https://kotlinlang.org/docs/reference/extensions.html
class Extension {
    companion object {
        fun toUpper(list: MutableList<String>): MutableList<String> {
            return list.upper()
        }

        private fun MutableList<String>.upper(): MutableList<String> {
            for ((i, e) in this.withIndex()) {
                this[i] = e.toUpperCase()
            }
            return this
        }

        fun getMessage(): String {
            val message = Message()
            return message.get()
        }

        // Extension function can't override member function
        private fun Message.get(): String {
            return "Extension function"
        }

        // Nullable receiver
        private fun Message?.toString(): String {
            if (this == null) {
                return "null object"
            }

            return "Message Class"
        }

        fun toStringMessage(message: Message?): String {
            return message.toString()
        }
    }
}

// Extension function can't override member function
class Message {
    fun get(): String {
        return "Message function"
    }
}
