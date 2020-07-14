package types

import java.lang.IllegalArgumentException
import kotlin.random.Random

fun fail(message: String) {
    println("Failing $message")
}

fun failNothing(message: String): Nothing {
    //function should not complete
    //Nothing is subtype of all types
    //bytecode void
    throw IllegalArgumentException(message)
}

fun main() {
    val flag: Boolean = Random(10).nextBoolean();
    val answer = if (flag) { 42 } else { fail("Not good") }
    //val answerI: Int = if (flag) { 42 } else { fail("Not good") }
    //fail does not compile ^

    //val answerU: Unit = if (flag) { 42 } else { fail("Not good") }
    //42 does not compile ^

    val answerIN: Int = if (flag) { 42 } else { failNothing("Not good") }
    val answerN = if (flag) { 42 } else { failNothing("Not good") }

    var abc = null;
    var xyz: Nothing? = null
    var pqr: Unit? = null
    var efg: Any? = null

    //abc = "String"
    //xyz = "String"
    //pqr = "String"
    //does not compile ^

    efg = "String"
    //works as Any and Any? is super type of all

}