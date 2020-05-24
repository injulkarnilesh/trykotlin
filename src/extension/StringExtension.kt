package extension

import java.lang.StringBuilder

fun String.letterAt(index: Int): Char {
    return get(index)
}

fun String.camelCase(): String {
    val builder = StringBuilder(this.length);
    var nextCharCap = false;
    for (i in 0 until length) {
        if (get(i) == ' ') {
            nextCharCap = true
        } else if (nextCharCap) {
            nextCharCap = false
            builder.append(get(i).toUpperCase())
        } else {
            nextCharCap = false
            builder.append(get(i).toLowerCase())
        }
    }
    return builder.toString();
}

fun main() {
    println("ABC".letterAt(1))
    println("hello worlD hI THere".camelCase())
}