package atomickotlin.`05-extensionfunction`

fun main() {
    // Kotlin’s extension functions effectively add member functions to existing classes.

    fun String.singleQuote() = "'$this'"
    fun String.doubleQuote() = "\"$this\""

    println("Hi".singleQuote())
    println("Hi".doubleQuote())

    class Book(val title: String)

    fun Book.categorize(category: String) =
        println("""title: "$title", category: $category""")

    Book("Dracula").categorize("Vampire")
}