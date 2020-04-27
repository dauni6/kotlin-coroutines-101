import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    //repeat 1000000번 해도 코루틴이 lightweight 이기에 큰 무리없이 동작할 수 있다
    runBlocking {
        repeat(1_000_000) {
            launch {
                print(".")
            }
        }
    }
}