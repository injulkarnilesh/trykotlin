package oo

import java.lang.Appendable
import java.lang.StringBuilder
import kotlin.Number

fun <T> printWell(message: T) {
    println("********")
    println(message)
    println("********")
}

class Savior<T: Number?> (val saved: T) {
    fun save() {
        println(saved)
    }
}

fun <T> query(url: T) where T: CharSequence, T:Appendable {
    if (!url.endsWith('?')) {
        url.append("?")
    }
}

fun main() {
    printWell("Hello")
    printWell(2)

    val saved = Savior(23)
    saved.save();
    val savedN = Savior(null)

    val url = StringBuilder(".com")
    query(url)
    println(url)
}