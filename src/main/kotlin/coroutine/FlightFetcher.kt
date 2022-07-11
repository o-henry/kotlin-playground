package coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.net.URL

private const val BASE_URL = "http://kotlin-book.bignerdranch.com/2e"
private const val FLIGHT_ENDPOINT = "$BASE_URL/flight"

fun main() {
    println("started")
    GlobalScope.launch {
        val flight = fetchFlight()
        println(flight)
    }
    println("finished")
}

fun fetchFlight(): String = URL(FLIGHT_ENDPOINT).readText()