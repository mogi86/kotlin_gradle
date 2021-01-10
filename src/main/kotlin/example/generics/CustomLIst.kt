package example.generics

import java.util.function.BiPredicate

// see: https://kotlinlang.org/docs/reference/generics.html

// "<T>" is the definition of type parameter.
// Type parameter is used for the receiver and the type for returning.
fun <T> List<T>.implode(separator: String): String {
    var str = ""

    for (v in this) {
        if (str.isNotEmpty()) str += separator
        str += v.toString()
    }

    return str
}

fun <T> List<T>.filter2(predicate: (T) -> Boolean): List<T> {
    val list = mutableListOf<T>()
    for (v in this) {
        if (predicate(v)) list.add(v)
    }

    return list
}

// Upper Bound
//
// see: https://kotlinlang.org/docs/reference/generics.html#upper-bounds
fun <T : Int> List<T>.sum(): Int {
    var total = 0
    for (element in this) {
        total += element
    }

    return total
}
