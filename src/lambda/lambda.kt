package lambda

import java.lang.Integer.toString
import java.lang.Integer.parseInt as parseInteger

val isEven: (Int) -> Boolean = { it % 2 == 0}

fun wait(job: Runnable, millis: Long = 0 ) {
    println("Waiting for $millis")
    job.run()
}

fun waiting(millis: Long, job: () -> Unit) {
    println("Waiting for $millis")
    job.invoke()
}

var anyNumber: () -> Int = { 43 }

val num: (Int) -> Int? =  { if (it % 2 == 0) it else null }
//lambda returning nullable Int
val numb: (() -> Int)? =  if (isEven.invoke(12)) anyNumber  else null
//nullable lambda

fun main() {
    val evens = listOf("1", "2", "3", "4", "5", "6")
            .map { str -> parseInteger(str) }
            .filter { it % 2 == 0 }
            .map() { toString(it) }
    println(evens)

    val evenOnes = listOf(1, 3, 5, 7, 2, 6, 8, 2, 0)
            .filter(isEven)
    println(evenOnes)

    val runnable = Runnable { println("Job") }
    wait(runnable)
    waiting(2) { println("Me") }

    run { println("Hello There") }

    val output: Int? = num(3)
    val result: Int? = numb?.invoke()
    println("$output and $result")

}