package example.collection

/**
 * Collection is class to check the behavior about Collection.
 *
 * see: https://kotlinlang.org/docs/reference/collections-overview.html
 */
class Collection {
    data class Book(val name: String, val price: Int)

    companion object {
        // read-only (immutable)
        private val books = listOf(
            Book("java book", 2000),
            Book("kotlin book", 2300),
            Book("golang book", 2100),
        )

        // mutable
        private val mutableBooks = mutableListOf(
            Book("java book", 2000),
            Book("kotlin book", 2300),
            Book("golang book", 2100),
        )

        fun findMaxPrice(): Book? {
            // maxByOrNull return the first element yielding the largest value of the given function,
            // or `null` if there are no elements.
            return books.maxByOrNull { it.price }
        }

        // Set
        // see: https://kotlinlang.org/docs/reference/collections-overview.html#set
        //
        // Set stores unique elements
        // It seems that duplicated value is removed
        fun useSet(): Set<Int> {
            return setOf(1, 2, 3, 4, 4)
        }

        // List
        fun useList(): List<Int> {
            return listOf(1, 2, 3, 4, 4)
        }
    }
}
