package example.idiom

import example.idiom.Idiom.Companion.getString
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class IdiomTest {
    @Test
    fun testGetString() {
        assertEquals("Book(name=Golang, price=2000)", getString())
    }
}
