package example.generics

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CustomLIstTest {

    @Test
    fun listToString() {
        val list = listOf("apple", "orange", "peach")

        val expected = "apple,orange,peach"
        val result = list.implode(",")

        assertEquals(expected, result)
    }
}