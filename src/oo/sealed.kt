package oo

sealed class Expression

class Number(val number: Int) : Expression()
class Addition(val number1: Int, val number2: Int): Expression()

fun main() {
    val ex: Expression = Number(45)
    val result: Int = when(ex) {
        is Number -> ex.number
        is Addition -> ex.number1 + ex.number2
        //no default case needed due to sealed
        //sealed class and its subclasses in same file
        //not sub-classable outside this file.
    }
}