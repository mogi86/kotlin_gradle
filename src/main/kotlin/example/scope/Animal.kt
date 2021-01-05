package example.scope

data class Animal(val kind: String, var name: String, var age: Int) {
    fun changeName(new: String) {
        name = new
    }

    fun incrementAge() {
        age += 1
    }
}

data class Animal2(val kind: String, var name: String = "", var age: Int = 0) {
    fun changeName(new: String) {
        name = new
    }

    fun incrementAge() {
        age += 1
    }
}
