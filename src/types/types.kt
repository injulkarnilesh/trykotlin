package types

fun printMe(a: Any) {
    println("Printing Any $a")
}

fun printMe(i: Int) {
    println("Printing Int $i")
}

fun main() {
    val age: Int = 10 //Primitive at bytecode
    val result: Int? = 10 //Wrapper Integer at bytecode
    val list = listOf(10, 20) //Wrapper ...
    val ar: Array<Int> = arrayOf(1,10) //Wrapper
    var iarr: IntArray = IntArray(10) //Primitive

    val str: String = "Nilesh" //String with extension functions
    val a: Any = 12 //Object

    printMe(str)
    printMe(12)
    printMe(a)
}