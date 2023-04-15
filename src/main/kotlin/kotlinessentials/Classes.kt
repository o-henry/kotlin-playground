package kotlinessentials

class A {
    fun printMe() {
        println(this) // this is reference to the instance of the class we called this function on.
    }
}

fun main() {
    val a: A = A()
    println(a) // A@ADDRESS
    a.printMe() // A@ADDRESS (the same address)
}
