package example.idiom

// see: https://kotlinlang.org/docs/reference/idioms.html
class Idiom {
    private data class Book(val name: String, val price: Int)

    companion object {
        fun getString(): String {
            val book = Book("Golang", 2000)
            return book.toString()
        }
    }

    fun filterList(list: List<Int>): List<Int> {
        // same as "return list.filter { x -> x > 0 }"
        return list.filter { it > 0 }
    }
}
