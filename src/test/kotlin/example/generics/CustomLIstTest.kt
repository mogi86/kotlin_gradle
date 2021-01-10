package example.generics

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CustomLIstTest {

    @Test
    fun implode() {
        val list = listOf("apple", "orange", "peach")

        val expected = "apple,orange,peach"
        val result = list.implode(",")

        assertEquals(expected, result)
    }

    @Test
    fun filter2() {
        val list = listOf(1, 3, 5, 7, 9)

        val expected = listOf(7, 9)
        val result = list.filter2 { it > 5 }

        assertEquals(expected, result)
    }

    @Test
    fun sum() {
        val list = listOf(1, 3, 5, 7, 9)

        val expected = 25
        val result = list.sum()

        assertEquals(expected, result)
    }
}