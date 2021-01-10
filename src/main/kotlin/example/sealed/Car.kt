package example.sealed

// see: https://kotlinlang.org/docs/reference/sealed-classes.html
sealed class Car {
    class SmallCar(val name: String): Car()
    class BigCar(val name: String): Car()
}

// Don't need to use "else", when use Sealed Class.
//
// FYI:
//   It seems that Enum Class cannot be behavior same as Sealed Class.
//   Because Enum Class cannot use in "when + is".
fun sound(car: Car): String = when (car) {
    is Car.SmallCar -> "small sound"
    is Car.BigCar -> "big sound"
}
