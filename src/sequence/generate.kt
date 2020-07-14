package sequence


fun main() {
    val numbers = 1..100
    val list = generateSequence { numbers.random().takeIf { it % 2 == 0 } }
            .toList()
    println(list)  //until all even number list on odd stop sequence

    val red = generateSequence(0) { it + 1}
            .take(5).toList()
    println(red) //[0, 1, 2, 3, 4]

    val fibonaciSeq = sequence<Int> {
        var i1 = 0
        var i2 = 1
        while (true) {
            yield(i1)
            val temp = i2
            i2 += i1
            i1 = temp
        }
    }
    val fibonaciList = fibonaciSeq.take(10).toList()
    println(fibonaciList) //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
}