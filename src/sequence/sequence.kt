package sequence

fun main() {
    listOf<Int>(1, 3, 4, 5, 6, 2, 8, 9)
            .asSequence() //more like stream, lazy
            .filter { it % 2 == 0 }
            .map { it * 100 }
            .forEach { println(it) }
}