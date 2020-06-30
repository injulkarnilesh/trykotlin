package inline

fun chalava(f: () -> Unit) {
    f()
}

inline fun jagyavarChalava(f: () -> Unit) {
    f()
}

fun main() {
    chalava { println("Inside lambda") }
    jagyavarChalava { println("Inlined lambda") }
    //inline avoids cost of anonymous class creation required for lambda
}
