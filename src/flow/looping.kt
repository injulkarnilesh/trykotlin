package flow

fun forRange() {
    for (i in 0..9) {
        print(i)
    }
    println()
}

fun forRangeUntil() {
    for (i in 0 until 9) {
        print(i)
    }
    println()
}

fun forRangeBackwards() {
    for (i in 9 downTo 1) {
        print(i)
    }
    println()
}

fun forSteps() {
    for (i in 1..10 step 2) {
        print(i)
    }
    println()
}

fun forList(list: List<String>) {
    for(e in list) {
        println(e)
    }
    for ((index, element) in list.withIndex()) {
        println("$element at $index")
    }
    //Conditional in
    if ("batman" in list) {
        println("I am batman")
    }
}

fun type(ch: Char) = when(ch) {
    in '0'..'9' -> "Number"
    in 'a'..'z', in 'A'..'Z' -> "Alphabet"
    else -> "Unknown"
}

fun forMap(map: Map<Int, String>) {
    for ((key, value) in map) {
        println("$key = $value")
    }
}

fun forString(str: String) {
    for (c in str) {
        println(c)
    }
}

fun isDigit(ch: Char) = ch in '0'..'9'
fun isNotDigit(ch: Char) = ch !in '0'..'9'

fun stringIn(from: String, to: String, value: String): Boolean {
    val closedRange = from..to
    return value in closedRange
}
//= value in from..to

fun main() {
    forRange()  //0123456789
    forRangeUntil()  //012345678
    forRangeBackwards() //987654321
    forSteps()  //13579

    forList(listOf("superman", "batman", "captain"))
    forMap(mapOf(1 to "One", 2 to "Two", 3 to "Three"))
    forString("nilesh");

    println(type('6'))
    println(type('d'))
    println(type('&'))

    println(isDigit('7'))
    println(isNotDigit('7'))


    println(stringIn("dog", "fox", "elephant"))
    //e is in d..f => true using compareTo
    println(stringIn("dog", "fox", "cat"))
    //c not is in d..f => false using compareTo

    println("String comparison ${"abc" < "pqr"}")
    //"abc".compareTo("pqr") < 0
    //Comparison operators work on all Comparables
}

