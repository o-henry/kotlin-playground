package reference

interface IntPredicateNormal { // interface
    fun accept(i: Int): Boolean
}

fun interface IntPredicate { // SAM interface
    fun accept(i: Int): Boolean
}

val isEvenWithNormal = object : IntPredicateNormal { // with normal interface
    override fun accept(i: Int): Boolean {
        return i % 2 == 0
    }
}

val isEven = IntPredicate { it % 2 == 0 }


fun main() {
    println("Is 7 even with normal? - ${isEvenWithNormal.accept(7)}")
    println("Is 7 even? - ${ isEven.accept(7)}")
}