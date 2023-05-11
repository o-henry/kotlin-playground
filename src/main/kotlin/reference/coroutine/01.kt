package reference.coroutine

import kotlinx.coroutines.*

// https://simplecode.kr/25

/**
 * 2023.05.11
 * 원래 흐름대로 라면, 함수 호출시 스택에 쌓여서 실행이 완료되어야 다음 함수가 실행되어야 하는데, 독립적으로 동작할 수 있다는 말인듯 하다.
 */
fun main() = runBlocking { // this: CoroutineScope
    launch { // 새로운 coroutine을 실행하고 계속한다.
        delay(1000L) // 블로킹 하지 않고 1초를 지연시킨다. (기본 시간 단위 : ms)
        println("World!") // 지연 이후에 프린트한다.
    }
    /**
     * ...
     * 2023.05.11
     * 원래 예상 흐름에서는 launch {} 를 만났을 때 해당 블록이 완료될때까지 println()이 실행이 안되어야 하는데, Coroutine은 독립적으로 실행되기 때문에
     * Hello가 먼저 실행된다.
     *
     * 즉, 메인 코루틴과 launch 코루틴은 독립적 작업단위로 실행되어 동시성을 이뤄낸다.
     */

    println("Hello") // 이전 coroutine이 지연된 동안 main coroutine이 실행된다.
}
