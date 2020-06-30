package inline

import kotlin.random.Random


fun main() {
    val ran = run {
        println("Running")
        "Ran"
    }
    println(ran)

    val result: String? = if (Random(100).nextBoolean()) "Result" else null
    //won't execute lambda if result null
    result?.let { println("Result found $it") }

    val str1: String? = ran.takeIf(String::isNotEmpty)
    val str2: String? = ran.takeIf {it.length > 5}
    println("$str1, $str2")

    ran.takeUnless { it.length > 5 }
        ?.let { println("unless > 5 $it") }

    repeat(10) { println("Repeating $it")}
}