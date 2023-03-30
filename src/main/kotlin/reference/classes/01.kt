package reference.classes

class Person constructor(name: String) {}
class _Person(name: String) // primary constructor
class __Person(val pets: MutableList<Pet> = mutableListOf())
class Pet {
    constructor(owner: __Person) {
        owner.pets.add(this)
    }
}

fun main() {
    val henry = Person(name = "Henry")
}
