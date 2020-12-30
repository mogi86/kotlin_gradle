package example.basic

import example.basic.Basic.Companion.isString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class BasicTest {
    companion object {
        @JvmStatic
        fun isStringListProvider(): Stream<Arguments> {
            return Stream.of(
                    arguments("apple", true),
                    arguments("", true),
                    arguments(1, false),
            )
        }
    }

    @ParameterizedTest
    @MethodSource("isStringListProvider")
    fun testIsString(param: Any, expected: Boolean) {
        val result = isString(param)
        assertEquals(expected, result)
    }
}