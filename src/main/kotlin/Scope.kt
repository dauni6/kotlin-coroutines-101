import kotlinx.coroutines.*

fun main() {
    println("프로그램 실행이 블락될것임")
    runBlocking {
        launch {
            delay(1000L)
            println("runBlocking 에서 Task중")
        }

        GlobalScope.launch {
            delay(500L)
            println("globalScope 에서 Task중")
        }

        coroutineScope {
            launch {
                delay(1500L)
                println("coroutinScope 에서 Task중")
            }
        }
    }
    println("프로그램이 계속 됨")
}