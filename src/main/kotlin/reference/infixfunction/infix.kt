package reference.infixfunction

// TODO: infix fun dispatcher.함수이름(recevier): 리턴타입 { 구현부 }
// 아래코드에서 this는 dispatcher를 의미하며 other는 receiver가 된다.
infix fun String.add(other: String): String = this + other

fun main() {
    val string = "Hello" add " World"
    // Hello = dispatcher · World = receiver
    println(string)
}