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

        val result = Collection.findMaxPrice()

        assertEquals(expected, result)
    }
}
