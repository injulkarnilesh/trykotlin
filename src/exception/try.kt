package exception

import java.io.IOException
import java.lang.NumberFormatException

fun parse(str: String) = try {
    Integer.parseInt(str)
} catch (ex: NumberFormatException) {
    null
}

@Throws(IOException::class)
fun checked(i : Int) {
    if (i !in 1..100) {
        throw IOException("IO")
    }
}

fun main() {
    println(parse("67"))
    println(parse("6x7"))

    //no try-catch required
    checked(120)
}
