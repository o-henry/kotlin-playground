package reference.coroutine

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        for (i in 1..10) {
            yield() // 취소 가능 시점에 다른 continuation에 실행식나을 양보한다.
            println("I'm sleeping $i ...")
            Thread.sleep(500L)
        }
    }


    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin()
    println("main: Now I can quit.")
}
