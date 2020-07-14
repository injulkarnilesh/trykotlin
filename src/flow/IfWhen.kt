package flow

import flow.Color.*

fun iq(age: Int) = if (age < 20) 10 else 100

enum class Color {
 RED, GREEN, YELLOW
}

//when for switch
fun representation(color: Color): String = when(color) {
    RED -> "ERROR"
    GREEN -> "SUCCESS"
    YELLOW -> "WARNING"
}

fun mix(color1: Color, color2: Color) = when(setOf(color1, color2)) {
    setOf(RED, YELLOW) -> "ORANGE"
    setOf(GREEN, YELLOW) -> "BLUE"
    else -> "UNKNOWN"
}

fun talk(animal: Animal) = when(animal) {
    is Cat -> animal.mew()
    is Dog -> animal.bark()
    else -> "Huuman"
}

//Returning and assigning Pair
fun multi(color: Color): String {
    val (name, size) = when(color) {
        RED -> RED.name to RED.ordinal
        YELLOW -> YELLOW.name to YELLOW.ordinal
        GREEN -> GREEN.name to GREEN.ordinal
    }
    return "Name $name / $size"
}

fun main() {
    println("Iq ${iq(22)}")
    println("Iq ${iq(12)}")

    println(representation(GREEN))

    println(mix(YELLOW, RED))
    println(mix(RED, GREEN))
    println(talk(Cat()))

    println(multi(GREEN))
}
