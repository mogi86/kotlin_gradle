package example.lambda

class Lambda {
    val square = { number: Int -> number * number }
    val nine = square(3)
}
