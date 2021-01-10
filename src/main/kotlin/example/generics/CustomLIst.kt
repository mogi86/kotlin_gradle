package example.generics

// see: https://kotlinlang.org/docs/reference/generics.html

fun <T> List<T>.implode(separator: String): String {
    var str = ""

    for (v in this) {
        if (str.isNotEmpty()) {
            str += separator
        }
        str += v.toString()
    }

    return str
}
