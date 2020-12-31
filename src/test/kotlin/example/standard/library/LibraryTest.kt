package example.standard.library

import example.data.Human
import example.standard.library.Library.Companion.divideToTwoList
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LibraryTest {
    @Test
    fun testDivideToTwoList() {
        val humans = listOf(
            Human("taro", 10),
            Human("yuta", 30),
            Human("takeru", 25),
            Human("ken", 24),
        )

        val expectedFirst = listOf(
            Human("taro", 10),
            Human("ken", 24),
        )

        val expectedSecond = listOf(
            Human("yuta", 30),
            Human("takeru", 25),
        )

        val (first, second) = divideToTwoList(humans, 25)

        assertEquals(expectedFirst, first)
        assertEquals(expectedSecond, second)
    }
}
