package extension

infix fun Boolean.ani(other: Boolean) = this && other
infix fun Boolean.kinva(other: Boolean) = this || other

infix fun <T> T.barobar(other: T) =
    if (this == other) {
        println("Barobar ahe. ${this} == ${other}")
    } else {
        println("Barobar Nahi. ${this} != ${other}")
    }


fun main() {
    println(true ani false)
    println(true kinva false)
    "hi" barobar "hi"
    "namaste" barobar "namaskar"
}