package example.extension

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ExtensionTest {

    @Test
    fun toUpper() {
        val list = mutableListOf("apple", "orange", "peach")
        val expected = mutableListOf("APPLE", "ORANGE", "PEACH")
        val result = Extension.toUpper(list)

        assertEquals(expected, result)
    }

    @Test
    fun getMessage() {
        val result = Extension.getMessage()
        val expected = "Message function"

        assertEquals(expected, result)
    }

    @Test
    fun toStringMessage() {
        val result = Extension.toStringMessage(null)
        val expected = "null object"

        assertEquals(expected, result)

        val result2 = Extension.toStringMessage(Message())
        val expected2 = "Message Class"

        assertEquals(expected2, result2)
    }
}