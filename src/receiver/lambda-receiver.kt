package receiver

fun str(builder: StringBuilder.() -> Unit): String {
    val s = StringBuilder()
    s.builder()  //builder.call(s) in js
    return s.toString()
}

fun main() {
    val sb = StringBuilder()
    var output: String

    with(sb) {
        append("Hi")
        for (ch in 'a'..'d') {
            append(ch)
        }
        output = toString()
    }
    println(output) //Hiabcd

    val name = str{
        append("Nilesh")
        append(" ")
        append("Injulkar")
    }
    println(name) //Nilesh Injulkar

}