package CH08_cookbook

interface Dialable {
    fun dial(number: String): String
}

class Phone : Dialable {
    override fun dial(number: String) = "Dialing $number..."
}

interface Snappable {
    fun takePicture(): String
}

class Camera : Snappable {
    override fun takePicture() = "Taking picture..."
}

class SmartPhone(
    private val phone: Dialable = Phone(),
    private val camera: Snappable = Camera()
) : Dialable by phone, Snappable by camera


// lazy

val ultimateAnswer: Int by lazy {
    println("computing the answer")
    42
}