package atomickotlin.`19-receiversandextension`

// https://typealias.com/start/kotlin-receivers-and-extensions/#receiver


fun main() {
    fun singleQuoted(original: String) = "'$original"

    val title = "The Robots from Planet X3"
    val quotedTitle = singleQuoted(title) // 'The Robots from Planet X3'
    val loudTitle = title.uppercase() // THE ROBOTS FROM PLANET X3
    singleQuoted(title.removePrefix("The")).uppercase() // 이 코드를 읽는 순서는 단방향이 아니다. 이를 해결하기 위해 Receiver 개념을 알아야 한다.


    /**
     * TODO: Receivers
     * A receiver is an object whose function you are calling.
     * It can either be explicit, as seen when calling a function with a dot, or…
     * It can be implicit, such as when one function calls another function inside the same class.
     */
    class Dog {
        fun speak() {
            println("Bark")
        }

        fun play() {
            this.speak() // The keyword this refers to the same object that play() is called upon.
            speak() // Implicit Receiver, this는 생략 가능하다. 객체에서 함수가 호출되면 해당 객체가 리시버다.
        }
    }

    val fido = Dog()
    fido.speak() // fido is receiver 점 왼쪽에 있는 개체를 리시버 라고 한다.

    /**
     * TODO: Extension function
     * Put the type of the parameter before the function name, and add a dot
     * Anywhere you used that parameter, rename it to this.
     * Finally, remove the original parameter from between the parentheses.
     */
    fun String.singleQuoted() = "'$this'"

    // now we have a readable code!
    val newTitle = title
        .removePrefix("The")
        .singleQuoted()
        .uppercase()
}