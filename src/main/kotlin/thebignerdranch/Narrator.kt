package thebignerdranch



var narrationModifier: (String) -> String = {it}

inline fun narrate(
    message: String,
    modifier: (String) -> String = { narrationModifier(it) }
) {
    println(modifier(message))
}
