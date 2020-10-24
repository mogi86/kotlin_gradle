package example.data

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HumanTest {
    @Test fun testToString() {
        val human = Human("Test", 100)
        assertEquals("Human(name=Test, age=100)", human.toString())
    }
}