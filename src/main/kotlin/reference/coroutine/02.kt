package reference.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * main 의 출력은
 * Hello
 * World 1
 * World 2
 * Done
 * 인데, Done은 왜 blocking 되었는지에 대해서 코멘트 해보자면,
 * doWorld()는 coroutineScope로 정의되어 있고, coroutineScope는 모든 자식코루틴이 완료될때까지 일시 중단된다.
 * 따라서 doWorld() 내부 launch 코루틴이 완료될 때까지 일시중단되어, println("Done")은 기다리게 된다.
 *
 * 즉 suspend와 같은 일시중단 함수를 사용하면 특정 지점에서 일시 중단되고, 다시 코루틴이 완료될때까지 기다리게 할 수 있다.
 */
fun main() = runBlocking {
    doWorld()
    println("Done")
}

suspend fun doWorld() = coroutineScope { // 일시 중단 함수
    launch {
        delay(2000L)
        println("World 2")
    }

    launch {
        delay(1000L)
        println("World 1")
    }

    println("Hello")
}
