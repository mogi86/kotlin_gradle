package example.scope

data class Animal(val kind: String, var name: String, var age: Int) {
    fun changeName(new: String) {
        name = new
    }

    fun incrementAge() {
        age += 1
    }
}
