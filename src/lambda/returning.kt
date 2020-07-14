package lambda

fun returningFun(list: List<Int>): Int {
    val mapped = list.map {
        if (it == 0) {
            return -1 //returns from last closest fun
        } else {
           it
        }
    }
    println(mapped)
    return 0
}

fun returningFunLabel(list: List<Int>): Int {
    val mapped = list.map {
        if (it == 0) {
            return@map -1  //return map
        } else {
            it
        }
    }
    println(mapped)
    return 0
}

fun returningFunLabelNamed(list: List<Int>): Int {
    val mapped = list.map lb@{
        if (it == 0) {
            return@lb -1  //return map
        } else {
            it
        }
    }
    println(mapped)
    return 0
}

fun main() {
    println("returningFun")
    println(returningFun(listOf(1, 2, 3))) //0
    println(returningFun(listOf(1, 0, 3))) //-1

    println("returningFunLabel")
    println(returningFunLabel(listOf(1, 2, 3))) //0
    println(returningFunLabel(listOf(1, 0, 3)))  //0

    println("returningFunLabelNamed")
    println(returningFunLabelNamed(listOf(1, 2, 3))) //0
    println(returningFunLabelNamed(listOf(1, 0, 3))) //0
}