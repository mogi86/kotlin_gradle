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
    }
}
