import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        delay(1000) //1초 딜레이 시키는 동안
        println("World!")
    }

    print("Hello, ") //여기 도착해서 출력하고
    Thread.sleep(2000) //전체 시스템을 2초간 sleep 시켜서 World가 마지막으로 출력 됨
}