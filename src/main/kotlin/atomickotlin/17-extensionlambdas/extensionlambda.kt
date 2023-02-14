package atomickotlin.`17-extensionlambdas`

fun main() {
    val va: (String, Int) -> String = { str, n ->
        str.repeat(n) + str.repeat(n)
    }

    val vb: String.(Int) -> String = {
        this.repeat(it) + repeat(it)
    }

    va("Vanbo", 2)
    "Vanbo".vb(2)
    vb("Vanbo", 2)

    val zero: Int.() -> Boolean = {
        this == 0
    }

    val one: Int.(Int) -> Boolean = {
        this % it == 0
    }
}