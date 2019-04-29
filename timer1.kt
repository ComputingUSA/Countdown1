import java.lang.Thread.sleep
import java.util.*
import kotlin.random.Random.Default.nextInt

fun main() {

    // Ask how long
    val reader = Scanner(System.`in`)
    print("How many seconds? ")
    var i:Int = reader.nextInt()

    //Count down
    while (i>0) {
        print("$i...")
        i--
        sleep(1000)
    }
    println("\nTime up!")
}
