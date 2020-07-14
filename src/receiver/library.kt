package receiver

import java.lang.StringBuilder
import kotlin.random.Random

fun strBuilder() = if (Random(100).nextBoolean()) StringBuilder("Str") else null

fun main() {
    val sb = strBuilder()
    sb?.run {
        //with won't work with nullable
        append("Updated")
        //whatever returned from here will be returned from run
    }
    println(sb.toString())  //StrUpdated

    val applied = sb?.apply {
        append(" Applied")
        //no returning, this is returned in apply
    }
    println(applied.toString()) //StrUpdated

}