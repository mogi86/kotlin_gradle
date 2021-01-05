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
}