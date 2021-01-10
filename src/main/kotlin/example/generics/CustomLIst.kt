package example.generics

import java.lang.IllegalStateException
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
//
// Actually, "<T : Int> List<T>.sum()" is able to be "List<Int>.sum()".
// Because "Int" is a final type.
fun <T : Int> List<T>.sum(): Int {
    var total = 0
    for (element in this) {
        total += element
    }

    return total
}

fun check(list: Collection<Any>): String {
    // if use "return list is List<Int>", below warning occur and cannot compile
    // "Cannot check for instance of erased type: List<Int>"
    //return list is List<Int>

    // Star Projection
    return if (list is List<*>) {
        "this is list"
    } else {
        "this isn't list"
    }
}

fun check2(list: Collection<Int>): String {
    // Can check
    return if (list is List<Int>) {
        "this is list"
    } else {
        "this isn't list"
    }
}

fun convert(list: Collection<Any>): List<Int> {
    return list as? List<Int> ?: throw IllegalStateException("cannot convert")
}
