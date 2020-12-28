package example.collection

/**
 * Collection is class to check the behavior about Collection.
 */
class Collection {
    private val books = listOf(
            Book("java book", 2000),
            Book("kotlin book", 2300),
            Book("golang book", 2100),
    )

    fun findMaxPrice(): Book? {
        // maxByOrNull return the first element yielding the largest value of the given function,
        // or `null` if there are no elements.
        return books.maxByOrNull { it.price }
    }

    data class Book(val name: String, val price: Int)
}
