package oo

object Logger {  //singleton
    fun message(message: String) {
        println(message)
    }
}

fun main() {
    Logger.message("Hello")
}