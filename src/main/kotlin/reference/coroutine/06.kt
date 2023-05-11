package reference.coroutine

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay

/**
 * Composing suspending functions
 * 원격 서비스 호출이나 계산과 같은 유용한 작업을 수행하는 두 개의 일시 중단 함수가 다른 곳에 정의되어 있다고 가정한다.
 * TODO
 * 두 함수를 순차적으로 호출해야 하는 경우 One -> Two 를 호출하고 합을 계산해야 하는 경우 어떻게 해야 할까
 */

suspend fun doSomethingUesrfulOne(): Int {
    delay(1000L)
    return 13
}

suspend fun doSomethingUesrfulTwo(): Int {
    delay(1000L)
    return 29
}
