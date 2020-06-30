package sequence

import java.lang.Thread.yield
import kotlin.random.Random

fun main() {
    val numbers = 1..100
    val list = generateSequence { numbers.random().takeIf { it % 2 == 0 } }
            .toList()
    println(list)

    val red = generateSequence(0) { it + 1}
            .take(5).toList()
    println(red)

    val fibonaciSeq = sequence<Int> {
        var i1 = 0
        var i2 = 1
        while (true) {
            yield(i1)
            val temp = i2
            i2 += i1
            i1 = temp
        }
    }
    val fibonaciList = fibonaciSeq.take(10).toList()
    println(fibonaciList)
}