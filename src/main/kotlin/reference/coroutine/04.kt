package reference.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    /***
     * Job을 통해서 코루틴을 제어할 수 있다.
     */
    val job = launch {
        repeat(1000) { i ->
            println("job: I'm sleeping $i ...")
            delay(500L)
        }
    }

    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancel() // Job을 cancel 한다.
    job.join() // Job의 실행이 완료될 때까지 기다린다.
    println("main: Now I can quit.")
}
