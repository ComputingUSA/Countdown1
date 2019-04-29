import java.lang.Thread.sleep

fun main() {
    var i=10
    while (i>0) {
        print("$i...")
        i--
        sleep(1000)
    }
    println("time up!")
}