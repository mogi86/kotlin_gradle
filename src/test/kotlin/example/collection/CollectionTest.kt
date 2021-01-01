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

    @Test
    fun testUseSet() {
        val result = Collection.useSet()
        val expected = "[1, 2, 3, 4]"

        assertEquals(expected, result.toString())
    }

    @Test
    fun testUseList() {
        val result = Collection.useList()
        val expected = "[1, 2, 3, 4, 4]"

        assertEquals(expected, result.toString())
    }

    @Test
    fun testGenerateRange() {
        val result = Collection.generateRange()

        assertEquals("Coordinate(x=0, y=0)..Coordinate(x=10, y=15)", result.toString())
    }

    @Test
    fun testPrintProgression() {
        val result = Collection.printProgression()

        assertEquals("1 3 5 7 9 ", result)
    }
}
