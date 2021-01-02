package example.classes

// the constructor keyword can be omitted
// see: https://kotlinlang.org/docs/reference/classes.html#constructors
//
// The output result will look like below.
// The processing of the secondary constructor block will be executed after "init".
//
//  [init]
//  name: Hi!
//  len: 3
//  [secondary construct]
//  name.length: 3
class Sample constructor(val name: String, private val len: Int) {
    // "init" is initializer block
    init {
        println("[init]")
        println("name: $name")
        println("len: $len")
    }

    constructor(name: String): this(name, name.length) {
        println("[secondary construct]")
        println("name.length: " + name.length)
    }

    override fun toString(): String {
        return "[name]=$name [len]=$len"
    }
}
