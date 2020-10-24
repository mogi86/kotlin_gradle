package example.collection

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CollectionTest {

    @Test
    fun findMaxPrice() {
        val expected = Collection.Book(
                "kotlin book",
                2300
        )

        val collection = Collection()
        val result = collection.findMaxPrice()

        assertEquals(expected, result)
    }
}
